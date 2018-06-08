import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMergerWithOneLoopShould {
    @Test
    public void merge() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {1, 2, 5, 6, 3, 4};
        int secondArray[] = {6, 55, 22, 7, 22};
        int expectedArray[] = {1, 2, 5, 6, 3, 4, 6, 55, 22, 7, 22};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }

    @Test
    public void have_new_length() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {1, 2, 5, 6, 3, 4};
        int secondArray[] = {6, 55, 22, 7, 22};
        int expectedLength = firstArray.length + secondArray.length;
        //Then
        Assertions.assertEquals(expectedLength, arrayMerge.merge(firstArray, secondArray).length);
    }

    @Test
    public void maintain_elements_order() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {1, 2, 5, 6, 3, 4};
        int secondArray[] = {6, 55, 22, 7, 22};
        int expectedElement = 22;
        int atIndex = 8;
        Assertions.assertEquals(expectedElement, arrayMerge.merge(firstArray, secondArray)[atIndex]);
    }

    @Test
    public void merge_arrays_with_single_element() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {6};
        int secondArray[] = {6};
        int expectedArray[] = {6, 6};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }


    @Test
    public void merge_arrays_with_first_array_empty() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {};
        int secondArray[] = {6};
        int expectedArray[] = {6};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }

    @Test
    public void merge_arrays_with_second_array_empty() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {6};
        int secondArray[] = {};
        int expectedArray[] = {6};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }

    @Test
    public void merge_empty() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = {};
        int secondArray[] = {};
        int expectedArray[] = {};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }

    @Test
    public void return_empty_array_on_null() {
        //Given
        ArrayMergeWithOneLoop arrayMerge = new ArrayMergeWithOneLoop();
        //When
        int firstArray[] = null;
        int secondArray[] = null;
        int expectedArray[] = {};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }

}
