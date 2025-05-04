import java.util.Scanner;

public class binomialCofficient {
    public static int factorial(int n) {
        int fact = 1;
        for (int count = n; count >= 1; count--) {
            fact = fact * count;
        }
        return fact;
    }

    public static int Binomial(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n - r);

        int BinomialCofficient = factN / (factR * factNminusR);
        return BinomialCofficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        System.out.println(Binomial(n, r));

        // Close the scanner after use
        sc.close();
    }
}
