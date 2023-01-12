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
    private int[] initialSeed = { 0, 1, 0, 1, 1, 1, 1, 0, 1 };
    private int size;
    private int tap;

    ///////////////////////////////////
    // Create your constructor here:
    ///////////////////////////////////
    ShiftRegister(int size, int tap) {
        // TODO:
        this.initialSeed = new int[size];
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
        this.initialSeed = seed;
    }

    /**
     * shift
     * @return
     * Description:
     */
    @Override
    public int shift() {
        // TODO:
        int[] placeholderArr = {};
        for (int j = 0; j < initialSeed.length - 1; j++) {
            placeholderArr[j] = 0;
        }
        for (int i = 1; i < initialSeed.length; i++) {
            placeholderArr[i - 1] = initialSeed[i];
        }
        placeholderArr[placeholderArr.length - 1] = 0;
        this.initialSeed = placeholderArr;
        return 0;
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
            shift();
            finalBits += Integer.toString(initialSeed[i]);
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
