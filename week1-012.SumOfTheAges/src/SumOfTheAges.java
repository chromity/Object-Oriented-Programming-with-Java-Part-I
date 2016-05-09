
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameAlpha = reader.nextLine();      
        System.out.print("Type your age: ");
        int ageAlpha = Integer.parseInt(reader.nextLine());
        
        System.out.print("\nType your name: ");
        String nameBeta = reader.nextLine();      
        System.out.print("Type your age: ");
        int ageBeta = Integer.parseInt(reader.nextLine());
        
        int sumOfAges = ageAlpha + ageBeta;
        
        System.out.println(nameAlpha + " and " + nameBeta + " are " + sumOfAges
                            + " years old in total.");
        // Implement your program here
    }
}
