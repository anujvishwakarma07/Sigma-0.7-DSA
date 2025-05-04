import java.util.Scanner;

public class factorialOfANumber {

    public static int factorial1(int Num) {
        int fact = 1;
        for (int count = Num; count >= 1; count--) {
            fact = fact * count;
        }
        System.out.print("The factorial is : " + fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int Num = sc.nextInt();

        factorial1(Num);

        // Close the scanner after use
        sc.close();
    }
}
