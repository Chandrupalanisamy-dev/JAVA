import java.io.File;

public class Exist{
    
    public static void main(String[] args) {

        File file = new File("student.txt");

        if (file.exists()) {

            System.out.println("File Exists.");

        } else {
            System.out.println("File Does Not Exist.");
        }
    }
}
