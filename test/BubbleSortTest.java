import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    int[] array;

    @Before
    public void init() {
        array = new int[]{5, 3, 1, 2, 4};
    }

    @Test
    public void testSort() {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
}
