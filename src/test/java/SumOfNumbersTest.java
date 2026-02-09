import com.dgrytsyna.recursive.RecursiveSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersTest {

    @Test
    public void testLargerNumbers() {
        assertEquals(10, RecursiveSum.sumOfNumbers(1234));
        assertEquals(45, RecursiveSum.sumOfNumbers(123456789));
    }

    @Test
    public void testWithZeros() {
        assertEquals(1, RecursiveSum.sumOfNumbers(100));
        assertEquals(5, RecursiveSum.sumOfNumbers(1004));
    }

}
