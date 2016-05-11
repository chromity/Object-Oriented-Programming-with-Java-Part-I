
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        
        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (counter <= limit) {
            sum += counter;
            counter++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
