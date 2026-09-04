package app;

public class typeCasting {
    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 423;

        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("Percentage Converted in double: ");
        System.out.println(percentage);

        System.out.println("===========================");

        double height = 89.67;
        double weight = 45.34;

        int intHeight = (int) height;
        int intWeight = (int) weight;

        System.out.println("Weight and Height converted to int:");
        System.out.println("Weight in INT: " + intHeight);
        System.out.println("Height in INT: " + intWeight);
    }
}
