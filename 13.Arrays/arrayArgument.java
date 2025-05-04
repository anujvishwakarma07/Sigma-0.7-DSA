public class arrayArgument {
    public static void argument(int arr[]){
        for(int i = 0; i <= arr.length; i++)
        System.out.println(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[] = {23, 54, 34, 33, 98, 44};
        argument(arr);
    }
}
