import java.util.*;
class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class Main23{

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Ravi", 80));
        list.add(new Student(101, "Priya", 90));
        list.add(new Student(102, "Kumar", 70));

        // Sort by ID
        Collections.sort(list,
                (s1, s2) -> s1.id - s2.id);

        System.out.println("Sort By ID");
        System.out.println(list);

        // Sort by Name
        Collections.sort(list,
                (s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("\nSort By Name");
        System.out.println(list);

        // Sort by Marks
        Collections.sort(list,
                (s1, s2) -> s1.marks - s2.marks);

        System.out.println("\nSort By Marks");
        System.out.println(list);
    }
}
