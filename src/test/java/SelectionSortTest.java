import com.dgrytsyna.sorting.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testBasicUnsortedArray() {
        Integer[] array = {64, 25, 12, 22, 11};
        SelectionSort.sort(array);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 64}, array);
    }

    @Test
    public void testReverseSorted() {
        Integer[] array = {5, 4, 3, 2, 1};
        SelectionSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testWithDuplicates() {
        Integer[] array = {3, 1, 4, 1, 5, 9, 2, 6};
        SelectionSort.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 4, 5, 6, 9}, array);
    }
}
