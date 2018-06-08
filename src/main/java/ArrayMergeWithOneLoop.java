public class ArrayMergeWithOneLoop {
    public int[] merge(int[] firstArray, int[] secondArray) {
        int firstArrayLength = firstArray != null ? firstArray.length : 0;
        int secondArrayLength = secondArray != null ? secondArray.length : 0;
        int totalLength = firstArrayLength + secondArrayLength;
        int[] mergedArray = new int[totalLength];

        int j = 0;
        for (int i = 0; i < totalLength; i++) {
            if (i < firstArray.length) {
                mergedArray[i] = firstArray[i];
            } else {
                mergedArray[i] = secondArray[j];
                j++;
            }
        }
        return mergedArray;
    }
}
