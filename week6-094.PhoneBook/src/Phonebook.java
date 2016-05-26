
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> contacts = new ArrayList<Person>();
    
    public void add(String name, String number) {
        contacts.add(new Person(name, number));
    }
     
    public void printAll() {
        for (Person contact : contacts) {
            System.out.println(contact);
        }
    }
    
    public String searchNumber(String name) {
        for (Person contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.getNumber();
            }    
        }
        
        return "number not known";
    }
}
