
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a float number to add to the graph: ");
            double temp = Double.parseDouble(reader.nextLine());

            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);
            }
        }
    }
}
