package app;

public class methods {

    // methods

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // recursion

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = sum(2, 3);
        System.out.println("\n===== Method Usage ======");
        System.out.println(result);

        System.out.println("\n===== Recursion ======");
        int results = sum(10);
        System.out.println(results);




    }


}
