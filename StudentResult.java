import java.io.File;
public class StudentResult{
    public static void main(String[]args){
        try{

            File file = new File("result.txt");

            if(file.createNewFile()){
                System.out.println("File Created Sucessfully.");
            }else{
                System.out.println("file alreeady exists..");
            }
        }
        catch(Exception e){

            System.out.println("File not Found");
        }
    }
    
}
