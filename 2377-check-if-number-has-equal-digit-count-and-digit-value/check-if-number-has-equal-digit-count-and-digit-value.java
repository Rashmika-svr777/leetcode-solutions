class Solution {
    public boolean digitCount(String num) {
        
        int[] freq=new int[10];

        for(int i=0;i<num.length();i++){
            freq[num.charAt(i)-'0']++;
        }

        for(int i=0;i<num.length();i++){
            int expectedCount=num.charAt(i)-'0';
            int actualCount=freq[i];

            if(expectedCount!=actualCount){
                return false;
            }
        }
        return true;
    }
}