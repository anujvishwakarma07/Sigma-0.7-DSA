import java.util.Scanner;

public class checkPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {  // Prime numbers are greater than 1
            return false;
        }
        if (n == 2) {  // 2 is a prime number
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // If divisible, it's not a prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        // Check if the number is prime and display the result
        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }

        // Close the scanner
        sc.close();
    }
}
