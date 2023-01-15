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

    public int[] getInitialSeed() {
        return this.initialSeed;
    }
    ///////////////////////////////////
    // Create your constructor here:
    ///////////////////////////////////
    public ShiftRegister(int size, int tap) {
        // TODO:
        this.initialSeed = new int[size];
        this.size = size;
        this.tap = tap;
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
        // Error checking
        for (int i = 0; i < seed.length; i++) {
            if (seed[i] != 0) {
                if (seed[i] != 1) {
                    System.out.println("Error, seed provided is invalid.");
                    return;
                }
            }
        }
        // Given input array is such that least significant bit is on index 0
        // Basically the order is reversed
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
        int mostSignificantBit = this.initialSeed[0];
        int tapBit = this.initialSeed[this.initialSeed.length - this.tap - 1];
        // Step 1: Calculate feedback bit
        int feedbackBit = mostSignificantBit ^ tapBit;

        // Step 2 & 3: Drop significant bit + Move every bit to left
        // {0,1,1}
        // {1, 1}
        for (int i = 0; i < this.initialSeed.length - 1; i++) {
            this.initialSeed[i] = this.initialSeed[i + 1];
        }

        // Step 4
        this.initialSeed[this.initialSeed.length - 1] = feedbackBit;

        // Return int value
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
        // TODO:
        String finalBits = "";
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
