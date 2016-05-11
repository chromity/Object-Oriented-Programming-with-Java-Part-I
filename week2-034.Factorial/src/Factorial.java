import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        
        int counter = 1;
        while (counter <= number) {
            factorial *= counter;
            counter++;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}
