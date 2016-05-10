
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (username.equals("alex")) {
            if (password.equals("mightyducks")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
        } else if (username.equals("emily")) {
            if (password.equals("cat")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
