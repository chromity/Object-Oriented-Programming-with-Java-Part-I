
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name;
        String studentNumber;
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            Student newStudent = new Student(name, studentNumber);
            list.add(newStudent);
        }

        for (Student newStudent : list) {
            System.out.println(newStudent);
        }

        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");

        for (Student newStudent : list) {
            if (newStudent.getName().contains(term)) {
                System.out.println(newStudent);
            }
        }
    }
}
