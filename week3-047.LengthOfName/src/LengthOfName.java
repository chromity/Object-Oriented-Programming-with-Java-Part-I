
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String username = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(username));
    }
    
    public static int calculateCharacters(String username) {
        return username.length();
    }   
}
