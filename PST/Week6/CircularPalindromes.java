import java.util.*;
public class CircularPalindromes {
    // For each circular rotation, return the longest palindromic substring length.
    public static int[] longestForRotations(String s) {
        int n=s.length();int[] ans=new int[n];String doubled=s+s;
        for(int shift=0;shift<n;shift++){String r=doubled.substring(shift,shift+n);int best=0;
            for(int c=0;c<n;c++){best=Math.max(best,expand(r,c,c));best=Math.max(best,expand(r,c,c+1));}ans[shift]=best;}
        return ans;
    }
    private static int expand(String s,int l,int r){while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){l--;r++;}return r-l-1;}
}
