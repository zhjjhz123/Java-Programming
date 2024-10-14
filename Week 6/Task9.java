import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);


        System.out.print("row: ");
        int numRows = scanner.nextInt();
        System.out.print("column: ");
        int numCols = scanner.nextInt();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numCols; j++) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
