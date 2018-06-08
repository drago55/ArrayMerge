import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMergeShould {

    @Test
    public void merge() {
        //Given
        ArrayMerge arrayMerge = new ArrayMerge();
        //When
        int firstArray[] = {1, 2, 5, 6, 3, 4};
        int secondArray[] = {6, 55, 22, 7, 22};
        int expectedArray[] = {1, 2, 5, 6, 3, 4, 6, 55, 22, 7, 22};
        //Then
        Assertions.assertArrayEquals(expectedArray,
                arrayMerge.merge(firstArray, secondArray));
    }
}
