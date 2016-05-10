import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (b > a) {
            System.out.println("Greater number: " + b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
