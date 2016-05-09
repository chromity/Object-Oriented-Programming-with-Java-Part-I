
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        double quotient = 1.0 * a / b; // converts the product to a double
        
        System.out.print("\nDivision: " + a + " / " + b + " = " + quotient);
        // Implement your program here. Remember to ask the input from user.
    }
}
