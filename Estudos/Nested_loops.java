import java.util.Scanner;

public class Nested_loops{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i<=rows; i++) {
            System.out.println();
            for (int a = 1; a <= columns; a++) {
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}