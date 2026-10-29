import java.util.*;
class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] s=new String[nums.length];for(int i=0;i<nums.length;i++)s[i]=String.valueOf(nums[i]);
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        if(s.length>0&&s[0].equals("0"))return "0";
        StringBuilder out=new StringBuilder();for(String x:s)out.append(x);return out.toString();
    }
}
