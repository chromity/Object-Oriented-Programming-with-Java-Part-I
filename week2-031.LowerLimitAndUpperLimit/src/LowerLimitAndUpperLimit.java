
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int flooring = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int ceiling = Integer.parseInt(reader.nextLine());
        
        while (flooring <= ceiling) {
            System.out.println(flooring);
            flooring++;
        }
        
        
        // write your code here

    }
}
