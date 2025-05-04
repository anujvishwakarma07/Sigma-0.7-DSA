import java.util.Arrays;
import java.util.Collections;;
public class inBuiltSort {
    public static void printArray(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {2, 3, 1, 3, 9, 2, 5, 0, 6, 2, 8};
        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr, 0, arr.length, Collections.reverseOrder());
        printArray(arr);    
    }
}
