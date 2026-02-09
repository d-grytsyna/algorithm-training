import com.dgrytsyna.recursive.RecursiveMax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveMaxTest {

    @Test
    public void testSingleElement() {
        Integer[] array = {42};
        assertEquals(Integer.valueOf(42), RecursiveMax.findMax(array));
    }

    @Test
    public void testTwoElements() {
        Integer[] array = {10, 5};
        assertEquals(Integer.valueOf(10), RecursiveMax.findMax(array));

        Integer[] array2 = {5, 10};
        assertEquals(Integer.valueOf(10), RecursiveMax.findMax(array2));
    }

    @Test
    public void testMaxAtBeginning() {
        Integer[] array = {100, 2, 3, 4, 5};
        assertEquals(Integer.valueOf(100), RecursiveMax.findMax(array));
    }

    @Test
    public void testMaxAtEnd() {
        Integer[] array = {1, 2, 3, 4, 100};
        assertEquals(Integer.valueOf(100), RecursiveMax.findMax(array));
    }

    @Test
    public void testMaxInMiddle() {
        Integer[] array = {1, 2, 100, 4, 5};
        assertEquals(Integer.valueOf(100), RecursiveMax.findMax(array));
    }

    @Test
    public void testWithStrings() {
        String[] array = {"apple", "zebra", "banana", "mango"};
        assertEquals("zebra", RecursiveMax.findMax(array));
    }

}