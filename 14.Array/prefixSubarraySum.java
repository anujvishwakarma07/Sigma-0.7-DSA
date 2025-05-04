public class prefixSubarraySum {
    public static void prefixSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];

       //Calculate the prefix array.
       for(int i = 1; i < prefix.length; i++){
        prefix[i] = prefix[i - 1] + arr[i];
       }

       for(int i = 0; i < arr.length; i++){
        int start = i;
        for(int j = i; j < arr.length; j++){
            int end = j;
            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
       }
       System.out.println("Max sum : " +maxSum);

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -3, 7, 4, -3};
        prefixSum(arr);
    }
}
