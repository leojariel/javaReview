package app;

public class Operators {
    public static void main(String[] args) {

        // Basic Arithmetic

        System.out.println("Basic Arithmetic\n");

        int num1 = 25;
        int num2 = 15;

        int sum = num1 + num2;
        System.out.println("====== Addition ======");
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int difference = num1 - num2;
        System.out.println("====== Subtraction ======");
        System.out.println(num1 + " - " + num2 + " = " + difference);

        int product = num1 * num2;
        System.out.println("====== Multiplication ======");
        System.out.println(num1 + " * " + num2 + " = " + product);

        int quotient = num1 * num2;
        System.out.println("====== Division ======");
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        // Assignment

        System.out.println("\nAssignment Operators");

        double savings = 2340.45d;

        int withdraw = 240;
        savings -= withdraw;
        System.out.println("\nMinus Assignment:");
        System.out.println("Withdraw: -$" + withdraw);
        System.out.println("Money Left: $" + savings);

        double deposit = 634.50d;
        savings += deposit;
        System.out.println("\nMinus Assignment:");
        System.out.println("Deposit: +$" + deposit);
        System.out.println("Money Left: $" + savings);

        // Comparison Operators

        System.out.println("\nAssignment Operators");

        double a = 4532.4690d;
        int b = 2345;

        System.out.println("\nis " + a + " equals to " + b + "?");
        boolean isEqual = a == b;
        System.out.println("result: " + isEqual);

        System.out.println("\nis " + a + " not equals to " + b + "?");
        boolean isNotEqual = a != b;
        System.out.println("result: " + isNotEqual);

        System.out.println("\nis " + a + " greater than " + b + "?");
        boolean isGreater = a > b;
        System.out.println("result: " + isGreater);

        System.out.println("\nis " + a + " less than " + b + "?");
        boolean isLess = a < b;
        System.out.println("result: " + isLess);

        System.out.println("\nis " + a + " greater than and equals to " + b + "?");
        boolean isGreaterEqual = a >= b;
        System.out.println("result:" + isGreaterEqual);

        System.out.println("\nis " + a + " less than and equals to " + b + "?");
        boolean isLessEqual = a <= b;
        System.out.println("result:" + isLessEqual);


        // logical operators

        System.out.println("====== Logical Operators ======\n");

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Logical AND: ");
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));

        System.out.println("Logical OR: ");
        System.out.println("Has access: " + (isLoggedIn || isAdmin));

        System.out.println("Logical Not");
        System.out.println("Not logged in: " + (!isLoggedIn));


    }
}
