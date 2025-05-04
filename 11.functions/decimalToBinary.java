import java.util.*;

public class decimalToBinary {

    public static int decToBin(int decimal) {
        int Binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            Binary = Binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal /= 2;
        }
        return Binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal num : ");
        int dec = sc.nextInt();

        System.out.println("The Binary is : " + decToBin(dec));

        // Close the scanner after use
        sc.close();
    }
}
