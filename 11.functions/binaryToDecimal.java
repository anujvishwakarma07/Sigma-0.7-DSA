import java.util.Scanner;

// By Using while loop
public class binaryToDecimal {

    // public static int Bintodec(int BinNum){
    //     int decimal = 0;
    //     int power = 0;
    //     while(BinNum > 0){
    //         int lastdigit = BinNum % 10;
    //         decimal = decimal + (lastdigit * (int)Math.pow(2, power));
    //         power++;
    //         BinNum /= 10;
    //     }
    //     return decimal;
    // }

    // By using for loop
    public static int Bintodec(int BinNum) {
        int decimal = 0;
        for (int pow = 0; BinNum > 0; pow++) {
            int lastdigit = BinNum % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            BinNum /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int binary = sc.nextInt();
        System.out.println("The decimal is : " + Bintodec(binary));

        // Close the scanner after use
        sc.close();
    }
}
