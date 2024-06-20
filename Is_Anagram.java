class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int len1 = s.length();
        int len2 = t.length();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(len1==len2)
        {
            if(Arrays.equals(c1,c2))
            {
                return true;
            }
        }
        return false;
    }
}
