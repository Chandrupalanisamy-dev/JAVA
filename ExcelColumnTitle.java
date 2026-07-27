public class ExcelColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            result.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));    
        System.out.println(convertToTitle(28));   
        System.out.println(convertToTitle(701));  
        System.out.println(convertToTitle(214));  
    }
}