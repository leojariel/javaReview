package app;

public class breakAndContinue {
    public static void main(String[] args) {

        // break

        int[] userIDs = {101, 102, 103, 104, 105};
        int targetID = 104;

        for (int id : userIDs) {
            if (id == targetID) {
                System.out.println("User ID: " + targetID + " found!");
                break;
            }
            System.out.println("Finding target ID: " + id);
        }
        System.out.println("Finding done.");

        // continue

        int[] scores = {200, -5, -56, 203, 506, -67, 89};

        for (int score : scores) {
            if (score < 0) {
                continue;
            }
            System.out.println("Valid Score: " + score);
        }

    }
}
