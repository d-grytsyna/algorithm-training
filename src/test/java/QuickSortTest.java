import com.dgrytsyna.recursive.QuickSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    void testSortIntegerArray() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] arr = {5, 2, 8, 2, 9, 1, 5, 5};
        Integer[] expected = {1, 2, 2, 5, 5, 5, 8, 9};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }


    @Test
    void testStringArray() {
        String[] arr = {"banana", "apple", "cherry", "date"};
        String[] expected = {"apple", "banana", "cherry", "date"};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

}