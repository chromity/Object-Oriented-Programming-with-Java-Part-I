import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers:");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            
            sum += number;
            counter++;
            
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        
        double average = 1.0 * sum / counter;
        System.out.println("Average: " + average);
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
