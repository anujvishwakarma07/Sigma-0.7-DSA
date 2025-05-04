import java.util.Scanner;

public class avarageQ1 {

    public static int Avarage3Num(int a, int b, int c) {
        int Sum = a + b + c;
        int TotalNumber = 3;
        int Avarage = Sum / TotalNumber;

        return Avarage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();

        System.out.println("The Avarage is : " + Avarage3Num(a, b, c));

        // Close the scanner after use
        sc.close();
    }
}
