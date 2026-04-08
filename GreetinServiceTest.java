import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingServiceTest {

    GreetingService g = new GreetingService();

    @Test // ✅ PASS
    void testValidName() {
        assertEquals("Hello John", g.greet("John"));
    }

    @Test // ✅ PASS
    void testEmptyName() {
        assertEquals("Hello Guest", g.greet(""));
    }

    @Test // ❌ FAIL
    void testWrongOutput() {
        assertEquals("Hi John", g.greet("John")); // wrong
    }

    @Test // ❌ FAIL
    void testNullName() {
        assertEquals("Hello Null", g.greet(null)); // wrong
    }
}
