import com.dgrytsyna.binary_search.RecursiveBinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveBinarySearchTest {
    @Test
    public void testFindElementInMiddle() {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13};
        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 7, 0, array.length - 1);
        assertEquals(3, result);
    }

    @Test
    public void testFindFirstElement() {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13};
        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 1, 0, array.length - 1);
        assertEquals(0, result);
    }

    @Test
    public void testFindLastElement() {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13};
        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 13, 0, array.length - 1);
        assertEquals(6, result);
    }

    @Test
    public void testElementNotFound() {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13};
        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 6, 0, array.length - 1);
        assertEquals(-1, result);
    }
}
