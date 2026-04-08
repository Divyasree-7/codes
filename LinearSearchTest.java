import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    LinearSearch ls = new LinearSearch();
    int[] arr = {2, 4, 6, 8};

    @Test // ✅ PASS
    void testFound() {
        assertEquals(2, ls.search(arr, 6));
    }

    @Test // ✅ PASS
    void testNotFound() {
        assertEquals(-1, ls.search(arr, 10));
    }

    @Test // ❌ FAIL
    void testWrongIndex() {
        assertEquals(3, ls.search(arr, 6)); // wrong
    }

    @Test // ❌ FAIL
    void testAnotherFail() {
        assertEquals(0, ls.search(arr, 8)); // wrong
    }
}
