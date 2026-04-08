package org.bnmit.demo;

public class PriceCalculator {

    public double calculateFinalPrice(double price, String customerType, boolean isFestival) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        double discount = getDiscount(customerType, isFestival);
        double discountedPrice = price - (price * discount);

        double tax = calculateTax(discountedPrice);
        return discountedPrice + tax;
    }

    private double getDiscount(String customerType, boolean isFestival) {
        double baseDiscount;

        switch (customerType.toLowerCase()) {
            case "regular":
                baseDiscount = 0.05;
                break;
            case "premium":
                baseDiscount = 0.10;
                break;
            case "vip":
                baseDiscount = 0.20;
                break;
            default:
                throw new IllegalArgumentException("Invalid customer type");
        }

        if (isFestival) {
            baseDiscount += 0.05;
        }

        return Math.min(baseDiscount, 0.30); // max 30% discount
    }

    private double calculateTax(double amount) {
        return amount * 0.18; // 18% GST
    }
}
