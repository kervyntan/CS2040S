///////////////////////////////////
// This is the main shift register class.
// Notice that it implements the ILFShiftRegister interface.
// You will need to fill in the functionality.
///////////////////////////////////

/**
 * class ShiftRegister
 * @author
 * Description: implements the ILFShiftRegister interface.
 */
public class ShiftRegister implements ILFShiftRegister {
    ///////////////////////////////////
    // Create your class variables here
    ///////////////////////////////////
    // TODO:
    private int[] initialSeed;
    private int size;
    private int tap;

    ///////////////////////////////////
    // Create your constructor here:
    ///////////////////////////////////
    public ShiftRegister(int size, int tap) {
        // TODO:
        // Initialise variables in constructor
        this.size = size;
        this.tap = tap;
        this.initialSeed = new int[size];
    }

    ///////////////////////////////////
    // Create your class methods here:
    ///////////////////////////////////
    /**
     * setSeed
     * @param seed
     * Description:
     */
    @Override
    public void setSeed(int[] seed) {
        // TODO:
        // Set method
        // Seed input given:
        // Least significant bit is on the index 0 instead of last index

        // Error checking for seed:
        for (int i = 0; i < seed.length; i++) {
            if (seed[i] != 0) {
                if (seed[i] != 1) {
                    System.out.println("Error, seed provided is invalid.");
                }
            }
        }

        // If seed provided is correct
        // Initialise initialSeed in reverse order of input
        for (int j = seed.length; j > 0; j--) {
            this.initialSeed[seed.length - j] = seed[j - 1];
        }

    }

    /**
     * shift
     * @return
     * Description:
     */
    @Override
    public int shift() {
        // TODO:
        // Executes one shift step
        // Returns least significant bit of RESULTING

        // Step 1:
        int indexMostSignificantBit = 0;
        // Tap bit index counts from the right side
        // eg. Tap is 4, is the 5th least significant bit in size 8 register
        // 1,0,1,0,1,0,1,0
        // Index is calculated as -> length - tap - 1
        int indexTapBit = this.initialSeed.length - this.tap - 1;

        int feedbackBit = this.initialSeed[indexMostSignificantBit] ^ this.initialSeed[indexTapBit];

        // Step 2 & 3: Drop most signicant bit & move every bit to the left
        int[] droppedFirstBit = new int[this.initialSeed.length];
        for (int i = 1; i < this.initialSeed.length; i++) {
            if (i == this.initialSeed.length - 1) {
                droppedFirstBit[i - 1] = this.initialSeed[i];
                droppedFirstBit[i] = 0;
            } else {
                droppedFirstBit[i - 1] = this.initialSeed[i];
            }
        }
        this.initialSeed = droppedFirstBit;
        // Step 4: least significant set to feedback
        this.initialSeed[this.initialSeed.length - 1] = feedbackBit;
        return feedbackBit;

    }


    /**
     * generate
     * @param k
     * @return
     * Description:
     */
    @Override
    public int generate(int k) {
        String finalBits = "";

        // call shift each time until k times
        for (int i = 0; i < k; i++) {
            finalBits += Integer.toString(shift());
        }

        return binaryToDecimal(Integer.parseInt(finalBits));
    }

    public int binaryToDecimal (long x) {
        // eg binary 111
        int finalResult = 0;
        int i = 0;
        long remainder;

        while (x != 0) {
            remainder = x % 10;
            finalResult += remainder * Math.pow(2, i);
            x = x / 10;
            i++;
        }
        return finalResult;
    }

    /**
     * Returns the integer representation for a binary int array.
     * @param array
     * @return
     */
    private int toDecimal(int[] array) {
        // TODO:
        return 0;
    }

}
