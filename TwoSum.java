//Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
//Memory Usage: 39.1 MB, less than 44.91% of Java online submissions for Two Sum.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if(num1 + num2 == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    
}
