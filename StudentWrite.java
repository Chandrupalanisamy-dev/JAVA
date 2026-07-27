import java.io.FileWriter;



public class StudentWrite{

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("result.txt");

            writer.write("Name: Chax\n");
            writer.write("Tamil Mark: 91\n");
            writer.write("English Mark: 90\n");
            writer.write("Maths Mark: 80\n");

            writer.close();

            System.out.println(" Student Data Written Successfully.");

        } catch (Exception e) {

            System.out.println("Error in Writing.");

        }

    }

}

