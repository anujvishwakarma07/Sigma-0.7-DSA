public class Subaarrray {
    public static void subArray(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end  = j;
                currentSum = 0;
                for(int k = start; k <= end; k++){

                    //subarray Sum 
                    currentSum = currentSum + arr[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        subArray(arr);
    }
}
