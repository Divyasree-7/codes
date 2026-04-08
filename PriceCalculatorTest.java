package org.bnmit.demo;


import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    PriceCalculator calculator = new PriceCalculator();

    @Test
    public void testRegularCustomerWithoutFestival() {
        double result = calculator.calculateFinalPrice(1000, "regular", false);
        assertEquals(1121.0, result, 0.01);
    }

    @Test
    public void testPremiumCustomerWithFestival() {
        double result = calculator.calculateFinalPrice(2000, "premium", true);
        assertEquals(2006.0, result, 0.01); // ✅ FIXED
    }

    @Test
    public void testVIPCustomerWithFestival() {
        double result = calculator.calculateFinalPrice(5000, "vip", true);
        assertEquals(4425.0, result, 0.01); // ✅ FIXED
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCustomerType() {
        calculator.calculateFinalPrice(1000, "guest", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrice() {
        calculator.calculateFinalPrice(-100, "regular", false);
    }
}
