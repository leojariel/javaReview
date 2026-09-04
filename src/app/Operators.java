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
    }
}
