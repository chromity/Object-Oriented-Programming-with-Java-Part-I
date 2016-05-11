
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int end = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (number <= end) {
            sum += number;
            number++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
