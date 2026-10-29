import java.util.*;
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length]; int l=0, r=nums.length-1;
        for (int x: nums) if (x%2==0) ans[l++]=x; else ans[r--]=x;
        return ans;
    }
}
