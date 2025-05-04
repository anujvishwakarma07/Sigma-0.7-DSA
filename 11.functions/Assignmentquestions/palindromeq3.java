import java.util.Scanner;

public class palindromeq3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.print("The Number is Palindrome");
        } else {
            System.out.print("The Number is not Palindrome");
        }

        // Close the scanner after use
        sc.close();
    }

    public static boolean isPalindrome(int Num) {
        int original = Num;
        int Palindrome = 0;
        int pow = 0;
        while (Num > 0) {
            int lastDigit = Num % 10;
            Palindrome = Palindrome + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            Num /= 10;
        }
        return Palindrome == original;
    }
}
