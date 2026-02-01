import com.dgrytsyna.binary_search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testIntegerFoundInMiddle() {
        Integer[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    public void testNotFound() {
        Integer[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 4));
    }

    @Test
    public void testStrings_Alphabetical() {
        String[] arr = {"alpha", "beta", "delta", "epsilon", "gamma"};
        assertEquals(0, BinarySearch.binarySearch(arr, "alpha"));
        assertEquals(3, BinarySearch.binarySearch(arr, "epsilon"));
        assertEquals(4, BinarySearch.binarySearch(arr, "gamma"));
    }

}
