class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int a = 0; a < nums.length; a++){
            for(int b = a + 1; b < nums.length; b++){
                if(nums[a] == nums[b]){
                    return true;
                }
            }
        }
        return false;
    }
}