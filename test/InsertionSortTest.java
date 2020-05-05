import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    int[] array;
    char[] arrayChar;

    @Before
    public void init() {
        array = new int[]{5, 3, 1, 2, 4};
        arrayChar = new char[]{'c', 'e', 'a', 'd', 'b'};
    }

    @Test
    public void testSort() {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        char[] expectedChar = new char[]{'a', 'b', 'c', 'd', 'e'};
        InsertionSort.insertionSort(array);
        InsertionSort.insertionSort(arrayChar);
        assertArrayEquals(expected, array);
        assertArrayEquals(expectedChar, arrayChar);
    }
}