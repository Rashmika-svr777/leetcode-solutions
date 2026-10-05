class Solution {
    public int subtractProductAndSum(int n) {
        
        if(n==0) return 0;

        long sum=0;
        long prod=1;
        long ans;

        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        long fsum=sum;
        long fprod=prod;

        ans=fprod-fsum;

    return (int)ans;

    }
}