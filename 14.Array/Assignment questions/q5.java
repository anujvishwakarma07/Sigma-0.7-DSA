public class q5 {
    public static void triplates(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        // int reqArray [] = new int [3];
                        // reqArray[i] = {i, j, k};
                        System.out.println("Triplet Found : "+ nums[i]+ "," + nums[j]+ ","+ nums[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplates(nums);
    }
}
