/**
 * ❓ Question 2: Search in Rotated Sorted Array
 * 
 * There is an integer array `nums` sorted in ascending order (with distinct values).
 * 
 * Before passing to the function, the array may be rotated at an unknown pivot index `k`
 * (1 <= k < nums.length), such that the resulting array becomes:
 * 
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * 
 * For example:
 * Original: [0, 1, 2, 4, 5, 6, 7]
 * Rotated at index 3 → [4, 5, 6, 7, 0, 1, 2]
 * 
 * Given such a possibly rotated array `nums`, and an integer `target`, return the index
 * of `target` if found in the array. Otherwise, return -1.
 * 
 * The algorithm must run in O(log n) time complexity.
 * 
 * ✨ Examples:
 * 
 * Example 1:
 * Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
 * Output: 4
 * 
 * Example 2:
 * Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
 * Output: -1
 * 
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 * 
 * 🔒 Constraints:
 * - 1 <= nums.length <= 5000
 * - -10^4 <= nums[i] <= 10^4
 * - All values in nums are unique
 * - nums is an ascending array that may be rotated
 * - -10^4 <= target <= 10^4
 */


public class q2 {
    public static int search(int nums[]){
        int target = 2;
        int start = 0;
        int end  = nums.length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;

            //comparision
            if(target == nums[mid]){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target < nums[end]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums));
    }
}
