class Solution {
    public int trap(int[] height) {
        if (height==null||height.length<3) 
        {
            return 0;
        }

        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];

        for(int i=1;i<n;i++) 
        {
            left[i]=Math.max(left[i-1],height[i]);
        }

        for(int i=n-2;i>=0;i--) 
        {
            right[i]=Math.max(right[i+1],height[i]);
        }

        int water=0;

        for(int i=1;i<n-1;i++) 
        {
            water+=Math.max(0,Math.min(left[i],right[i])-height[i]);
        }

        return water;
    }
}


output:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
