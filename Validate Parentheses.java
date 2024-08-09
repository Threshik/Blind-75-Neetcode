class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char c = ch[i];
            if(c=='[' || c=='(' || c=='{')
            st.push(c);
            else
            {
                if(st.isEmpty())
                return false;
                else if((c==']' && st.peek()=='[')||(c=='}' && st.peek()=='{') || (c==')' && st.peek()=='('))
                st.pop();
                else
                return false;
            }
            
           
        }
        if(st.isEmpty())
        return true;
        return false;
    }
}
