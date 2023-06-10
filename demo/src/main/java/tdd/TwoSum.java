package tdd;

public class TwoSum {

    public static int[] twoSum(int[] intArray, int target) {
        int[] sumIndices = new int[2];
        for (int i = 0; i < intArray.length; i++) {
            for (int y = 0; y < intArray.length && y != i; y++) {
                if (intArray[i] + intArray[y] == target) {
                    sumIndices[1] = i;
                    sumIndices[0] = y;
                    return sumIndices;
                }
            }
        }
        return sumIndices;
    }

}
