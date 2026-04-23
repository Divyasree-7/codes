public class Calc {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        // Expecting: num1 num2 operator
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <num2> <operator>");
            System.exit(1);
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operator = args[2];

        double result = 0;

        switch (operator) {
            case "+":
                result = add(num1, num2);
                break;

            case "-":
                result = subtract(num1, num2);
                break;

            case "*":
                result = multiply(num1, num2);
                break;

            case "/":
                result = divide(num1, num2);
                break;

            default:
                System.out.println("Invalid operator");
                System.exit(1);
        }

        System.out.println("Result=" + result);
    }
}


------------------------------OR--------------------------------------

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    // Main method added
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}
    
