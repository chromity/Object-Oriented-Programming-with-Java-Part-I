
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();

        askScore(reader, scores);
    }

    public static void askScore(Scanner reader, ArrayList<Integer> scoreList) {
        int input = 0;
        while (true) {
            input = Integer.parseInt(reader.nextLine());
            if (input != -1) {
                scoreList.add(input);
            } else {
                break;
            }
        }

        sortScore(scoreList);
    }

    public static void sortScore(ArrayList<Integer> scoreList) {
        int countOfFailed = 0;
        int size = 0; // size of scoreList
        
        for (int score : scoreList) {
            if (score >= 0 && score <= 60) {
                size++;
            }
        }
        
        System.out.println("Grades distribution:");

        System.out.print("5: ");
        for (int score : scoreList) {
            if (score >= 50 && score <= 60) {
                System.out.print("*");
            }
        }
        System.out.println("");

        System.out.print("4: ");
        for (int score : scoreList) {
            if (score >= 45 && score < 50) {
                System.out.print("*");
            }
        }
        System.out.println("");

        System.out.print("3: ");
        for (int score : scoreList) {
            if (score >= 40 && score < 45) {
                System.out.print("*");
            }
        }
        System.out.println("");

        System.out.print("2: ");
        for (int score : scoreList) {
            if (score >= 35 && score < 40) {
                System.out.print("*");
            }
        }
        System.out.println("");

        System.out.print("1: ");
        for (int score : scoreList) {
            if (score >= 30 & score < 35) {
                System.out.print("*");
            }
        }
        System.out.println("");

        System.out.print("0: ");
        for (int score : scoreList) {
            if (score < 30 && score >= 0) {
                System.out.print("*");
                countOfFailed++;
            }
        }
        System.out.println("");

        if (scoreList.size() != 0) {
            System.out.println("Acceptance percentage: " + (double) ((size
                    - countOfFailed)) * 100 / size);
        } else {
            System.out.println("Acceptance percentage: 0");
        }
    }
}
