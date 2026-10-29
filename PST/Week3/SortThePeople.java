import java.util.*;
class SortThePeople {
    public String[] sortPeople(String[] names,int[] heights) {
        Integer[] idx=new Integer[names.length];for(int i=0;i<idx.length;i++)idx[i]=i;
        Arrays.sort(idx,(a,b)->Integer.compare(heights[b],heights[a]));
        String[] ans=new String[names.length];for(int i=0;i<idx.length;i++)ans[i]=names[idx[i]];return ans;
    }
}
