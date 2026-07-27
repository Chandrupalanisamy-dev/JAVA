import java.io.File;

public class Delete{

    public static void main(String[] args) {

        File file = new File("hello.java");

        if (file.delete()) {

            System.out.println("File Deleted Successfully.");

        } else {

            System.out.println("File Not Found.");

        }
    }
}
