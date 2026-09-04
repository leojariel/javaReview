package app;
import java.util.Scanner;

public class fibonacci {


    static int fibonacciGenerator(int term) {
        if (term <= 0) return 0;
        if (term == 1) return 0;
        if (term == 2) return 1;

        int t1 = 0, t2 = 1, nextTerm = 0;

        for (var i = 3; i <= term; i++) {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }

        return nextTerm;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter term: ");
        int term = scanner.nextInt();

        int result = fibonacciGenerator(term);
        System.out.println("Term " + term + " is: " + result);

    }
}
