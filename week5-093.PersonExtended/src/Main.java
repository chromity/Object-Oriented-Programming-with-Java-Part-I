
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar x = Calendar.getInstance();
        
        Person pekka = new Person("Pekka", 31, 12, 2009);
        Person martin = new Person("Martin");

        System.out.println(martin);
    }
    
}
  