import java.util.Scanner;

public class largest {
    public static int largestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
            if (arr[i] <= smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest Value is : " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest Number is  : " + largestNumber(arr));
        
        sc.close(); // closing the scanner after use
    }
}
