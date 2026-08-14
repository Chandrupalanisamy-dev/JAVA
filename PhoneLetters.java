import java.util.HashMap;
import java.util.Scanner;

public class PhoneLetters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        System.out.print("Enter a number (2-9): ");
        int n = sc.nextInt();

        if (map.containsKey(n)) {
            System.out.println(map.get(n));
        } else {
            System.out.println("Invalid Number");
        }
    }
}