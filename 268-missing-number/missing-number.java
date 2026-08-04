class Solution {
    public int missingNumber(int[] nums) {
        
        int xorres=nums.length;

        for(int i=0;i<nums.length;i++){
            xorres=xorres^i;
            xorres=xorres^nums[i];
        }
        return xorres;
    }
}