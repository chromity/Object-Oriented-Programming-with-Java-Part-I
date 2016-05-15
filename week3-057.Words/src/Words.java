import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String holder = "";
        while (true) {
            System.out.print("Type a word: ");
            holder = reader.nextLine();       
            if (holder.isEmpty()) {
                break;
            }
            
            words.add(holder);
        }
        
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
