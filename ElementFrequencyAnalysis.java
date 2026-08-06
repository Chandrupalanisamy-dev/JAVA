import java.util.*;

public class ElementFrequencyAnalysis{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
    
        int N = sc.nextInt();
        System.out.print("Array: ");
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int repeated = 0;
        int nonRepeated = 0;

        for (int count : map.values()) {

            if (count > 1)
                repeated++;
            else
                nonRepeated++;
        }

        System.out.println(repeated + " " + nonRepeated);

        sc.close();
    }
}