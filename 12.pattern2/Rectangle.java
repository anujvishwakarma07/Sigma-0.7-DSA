import java.util.Scanner;

public class Rectangle {

    public static void hollowRectangle(int totalRow, int totalColomn) {
        // For rows, outer loop
        for (int i = 1; i <= totalRow; i++) {
            // Inner loop
            for (int j = 1; j <= totalColomn; j++) {
                // Cell (i, j)
                if (i == 1 || i == totalRow || j == 1 || j == totalColomn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the TotalRow : ");
        int row = sc.nextInt();

        System.out.print("Enter the TotalColomn : ");
        int colomn = sc.nextInt();

        hollowRectangle(row, colomn);

        // Close the scanner after use
        sc.close();
    }
}
