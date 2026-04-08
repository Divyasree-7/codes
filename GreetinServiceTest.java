import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingServiceTest {

    GreetingService g = new GreetingService();

    @Test // ✅ PASS
    public void testValidName() {
        assertEquals("Hello John", g.greet("John"));
    }

    @Test // ✅ PASS
    public void testEmptyName() {
        assertEquals("Hello Guest", g.greet(""));
    }

    @Test // ❌ FAIL
    public void testWrongGreeting() {
        assertEquals("Hi John", g.greet("John")); // wrong
    }

    @Test // ❌ FAIL
    public void testNullName() {
        assertEquals("Hello Null", g.greet(null)); // wrong
    }
}
