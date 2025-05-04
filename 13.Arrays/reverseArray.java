import java.util.Scanner;
public class reverseArray {
    public static void reverse(int arr[]){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex < lastIndex){
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temp;

            firstIndex++;
            lastIndex--; 
        }
        System.out.println("Reversed Array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);

        // Close the Scanner after use
        sc.close();
    }
}
