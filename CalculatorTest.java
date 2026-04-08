import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test // ✅ PASS
    public void testAdd() {
        assertEquals(10, c.add(5, 5));
    }

    @Test // ✅ PASS
    public void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }

    @Test // ❌ FAIL
    public void testMultiply() {
        assertEquals(20, c.multiply(3, 5)); // wrong
    }

    @Test // ❌ FAIL
    public void testDivide() {
        assertEquals(3, c.divide(10, 2)); // wrong
    }
}
