import java.io.FileWriter;


public class Write{

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Hema\n");
            writer.write("Age: 23\n");

            writer.close();

            System.out.println("Data Written Successfully.");

        } catch (Exception e) {

            System.out.println("Error Writing File.");

        }

    }

}
