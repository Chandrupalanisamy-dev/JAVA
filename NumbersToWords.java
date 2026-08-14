import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        String[] ones = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String[] teens = {
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "","","Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (n == 0) {
            System.out.println("Zero");
            return;
        }

        String result = "";

        // Hundreds
        if (n >= 100) {
            result += ones[n / 100] + " Hundred";
            n = n % 100;

            if (n != 0)
                result += " ";
        }

        // 10 - 19
        if (n >= 10 && n <= 19) {
            result += teens[n - 10];
        }
        // 20 - 99
        else if (n >= 20) {
            result += tens[n / 10];

            if (n % 10 != 0)
                result += " " + ones[n % 10];
        }
        // 1 - 9
        else if (n > 0) {
            result += ones[n];
        }

        System.out.println(result);
       
    }
}