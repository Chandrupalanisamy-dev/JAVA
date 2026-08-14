import java.util.HashMap;

public class HashMapCode {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("name", 90);
        marks.put("Bob", 85);

        System.out.println(marks.size());
        marks.remove("");
        System.out.println(marks.get("name")); 
        System.out.println(marks.containsKey("name")); 
        
    }
}