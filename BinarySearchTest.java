import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    public void testElementFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int result = bs.search(arr, 5);
        assertEquals(2, result);
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int result = bs.search(arr, 4);
        assertEquals(-1, result);
    }

    @Test
    public void testFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int result = bs.search(arr, 1);
        assertEquals(0, result);
    }

    @Test
    public void testLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int result = bs.search(arr, 9);
        assertEquals(4, result);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int result = bs.search(arr, 5);
        assertEquals(-1, result);
    }
}
