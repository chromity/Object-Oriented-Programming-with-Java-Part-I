import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Birdwatcher birdwatch = new Birdwatcher();
        
        String command;
        while (true) {
            System.out.print("? ");
            command = reader.nextLine();
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                
                birdwatch.Add(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                
                birdwatch.Observation(name);
            } else if (command.equals("Statistics")) {
                
                birdwatch.Statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                
                birdwatch.Show(name);
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

}
