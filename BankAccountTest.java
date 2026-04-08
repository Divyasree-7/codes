import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test // ✅ PASS
    void testDeposit() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(150, acc.getBalance());
    }

    @Test // ✅ PASS
    void testWithdraw() {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(30);
        assertEquals(70, acc.getBalance());
    }

    @Test // ❌ FAIL
    void testWrongBalance() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(120, acc.getBalance()); // wrong
    }

    @Test // ❌ FAIL
    void testOverWithdraw() {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(200);
        assertEquals(0, acc.getBalance()); // wrong
    }
}
