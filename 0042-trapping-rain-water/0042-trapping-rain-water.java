class Solution {
    public int trap(int[] nums) {
      int n=nums.length;
      int[] rmax=new int[n];
      int[] lmax=new int[n];
      lmax[0]=nums[0];
      int vol=0;
      for(int i=1;i<n;i++)
      {
        lmax[i]=Math.max(nums[i],lmax[i-1]);
      }      
      rmax[n-1]=nums[n-1];
      for(int i=n-2;i>=0;i--)
      {
        rmax[i]=Math.max(nums[i],rmax[i+1]);
      }
      for(int i=0;i<n;i++)
      {
        vol=vol+Math.min(lmax[i],rmax[i])-nums[i];
      }
      return vol;
    }
}