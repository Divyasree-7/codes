import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test // ✅ PASS
    public void testDeposit() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(150, acc.getBalance(), 0.01);
    }

    @Test // ✅ PASS
    public void testWithdraw() {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(30);
        assertEquals(70, acc.getBalance(), 0.01);
    }

    @Test // ❌ FAIL
    public void testWrongBalance() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(120, acc.getBalance(), 0.01); // wrong
    }

    @Test // ❌ FAIL
    public void testOverWithdraw() {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(200);
        assertEquals(0, acc.getBalance(), 0.01); // wrong
    }
}
