class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]+1<10) //if it is not greater than 10 so we can just add 1 and return the array
            {
                digits[i]++;
                return digits;
            }
            else //set the ones place 0 if the adding one is greater than 10
            {
                digits[i]=0;
            }
        }
        digits = new int[n+1]; //create new array with one size bigger
        digits[0]=1; // make the first pos to 1
        return digits;
        
    }
}
