class Solution {
    public int missingNumber(int[] nums) {
        int esum=0,sum=0,ans;
        int n=nums.length;

        for(int i=0;i<n;i++){
            esum=n*(n+1)/2;
            sum=sum+nums[i];
        }

        ans=esum-sum;

        return ans;
    }
}