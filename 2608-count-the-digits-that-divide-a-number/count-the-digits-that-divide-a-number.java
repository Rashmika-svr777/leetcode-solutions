class Solution {
    public int countDigits(int num) {
        int digit;
        int count=0;
        int temp=num;

        if(num==0) return 1;

        while(num!=0){
            digit=num%10;
            if(temp%digit==0){
                count++;
            }
            num=num/10;
        }

        return count;
    }
}