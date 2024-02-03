class Solution {
    public boolean canJump(int[] nums) {
     int temp=0;
        for(int i=0;i<nums.length;i++) 
        {
            if(i>temp) 
            {
                return false;
            }
            temp=Math.max(temp,i+nums[i]);
            if(temp>=nums.length-1) 
            {
                return true;
            }
        }
        return false;
    }
}

output:

Input: nums = [3,2,1,0,4]
Output: false


Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
