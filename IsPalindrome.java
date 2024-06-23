class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int last = s.length()-1;

        while(start<=last)
        {
            char currstart = s.charAt(start);
            char currlast = s.charAt(last);
            if(!Character.isLetterOrDigit(currstart))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(currlast))
            {
                last--;
            }
            else
            {
                if(Character.toLowerCase(currstart)!=Character.toLowerCase(currlast))
                {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
        
    }
}
