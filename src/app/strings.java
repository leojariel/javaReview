package app;

import java.util.Locale;

public class strings {
    public static void main(String[] args) {

        // string length method

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the alphabet is: " + txt.length());


        // string uppercase and lowercase method

        String name = "john doe cruz";
        String address = "MEXICO";

        System.out.println("\nTo Uppercase: " + name.toUpperCase());

        System.out.println("\nTo Lowercase: " + address.toLowerCase());
    }
}
