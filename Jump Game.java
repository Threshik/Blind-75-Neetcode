class Solution {
    public boolean canJump(int[] nums) {
        int endindx=0;
        int maxindx=0;
        for(int i=0;i<nums.length;i++)
        {
            maxindx=Math.max(maxindx,i+nums[i]);
            if(endindx==i)
                endindx=maxindx;
            if(endindx>=nums.length-1)
            return true;
        }
        return false;
    }
}
