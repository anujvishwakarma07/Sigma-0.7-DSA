/**
 * ❓ Question 1: Contains Duplicate
 * 
 * Given an integer array `nums`, return `true` if any value appears at least 
 * twice in the array, and return `false` if every element is distinct.
 * 
 * ✨ Examples:
 * 
 * Example 1:
 * Input: nums = [1, 2, 3, 1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 * Output: true
 * 
 * 🔒 Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */

public class q1 {
    public static boolean duplicateNum(int nums[]){
        boolean duplicate = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println("Is any Number is Duplicate : "+ duplicateNum(nums));
    }
}
