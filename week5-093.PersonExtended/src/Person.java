
import java.util.Calendar;
import java.util.Locale;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name) {
        this(name, currentDate());       
    }

    public Person(String name, int pp, int kk, int vv) {
        this(name, new MyDate(pp, kk, vv));
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int age() {
        int date = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate currentDate = new MyDate(date, month, year);

        int age = currentDate.differenceInYears(this.birthday);

        return age;
    }

    public boolean olderThan(Person compared) {
        if (this.age() == compared.age()) {
            return this.birthday.isOlder(compared.birthday);
        }

        return this.age() > compared.age();

    }

    public String getName() {
        return this.name;
    }

    public static MyDate currentDate() {
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate currentDate = new MyDate(day, month, year);
        
        return currentDate;
    }
    
    @Override
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
