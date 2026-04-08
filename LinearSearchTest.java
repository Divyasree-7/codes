import org.junit.Test;
import static org.junit.Assert.*;

public class LinearSearchTest {

    LinearSearch ls = new LinearSearch();
    int[] arr = {2, 4, 6, 8};

    @Test // ✅ PASS
    public void testFound() {
        assertEquals(2, ls.search(arr, 6));
    }

    @Test // ✅ PASS
    public void testNotFound() {
        assertEquals(-1, ls.search(arr, 10));
    }

    @Test // ❌ FAIL
    public void testWrongIndex() {
        assertEquals(3, ls.search(arr, 6)); // wrong
    }

    @Test // ❌ FAIL
    public void testAnotherFail() {
        assertEquals(0, ls.search(arr, 8)); // wrong
    }
}
