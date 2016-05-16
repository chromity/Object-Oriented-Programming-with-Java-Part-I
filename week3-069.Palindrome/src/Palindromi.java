import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        int i = text.length() - 1;
        String reverse = "";
        while (i >= 0) {
            reverse += text.charAt(i);
            i--;
        }
        
        return reverse;
    }

    public static boolean palindrome(String text) {
        boolean isPalindrome = text.equals(reverse(text));
        
        return isPalindrome;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
