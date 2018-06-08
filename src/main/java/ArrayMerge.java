public class ArrayMerge {


    public int[] merge(int[] firstArray, int[] secondArray) {

        int firstArrayLength = firstArray != null ? firstArray.length : 0;
        int secondArrayLength = secondArray != null ? secondArray.length : 0;
        int totalLength = firstArrayLength + secondArrayLength;
        int[] mergedArray = new int[totalLength];

        for (int i = 0; i < firstArrayLength; i++) {
            mergedArray[i] = firstArray[i];
            System.out.println("adding first array " + firstArray[i]);
        }
        int newLength = firstArrayLength;

        for (int i = 0; i < secondArrayLength; i++) {

            mergedArray[newLength] = secondArray[i];
            System.out.println("adding second array " + secondArray[i]);
            newLength++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        ArrayMerge merge = new ArrayMerge();
        int firstArray[] = {1, 2, 5, 6, 3, 4};
        int secondArray[] = {6, 55, 22, 7, 22};
        int[] result = merge.merge(firstArray, secondArray);
        for (int i : result) {
            System.out.println("result of array " + i);
        }
    }
}
