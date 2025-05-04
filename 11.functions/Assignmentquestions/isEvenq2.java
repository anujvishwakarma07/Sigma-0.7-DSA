import java.util.Scanner;

public class isEvenq2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int Num = sc.nextInt();

        if (isEven(Num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Close the scanner after use
        sc.close();
    }

    public static boolean isEven(int Number) {
        if (Number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
