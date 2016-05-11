
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        
        System.out.print("Up to what number? ");
        int ceiling = Integer.parseInt(reader.nextLine());
        
        while (counter <= ceiling) {
            System.out.println(counter);
            counter++;
        }
        
        
    }
}
