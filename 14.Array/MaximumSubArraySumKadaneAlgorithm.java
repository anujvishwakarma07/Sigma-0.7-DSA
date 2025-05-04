public class MaximumSubArraySumKadaneAlgorithm {
    public static void kadaneAlgo(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum = currSum + nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
            // maxSum = Math.max(currSum, maxSum);
           
        }
        System.out.println("The maximum Sum is : "+ maxSum);
    }
    public static void main(String[] args) {
        int nums[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        // int nums[] = {-1, -2, -3, -4};
        kadaneAlgo(nums);
    }
}
