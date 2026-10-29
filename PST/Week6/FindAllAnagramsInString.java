import java.util.*;
class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s,String p) {
        List<Integer> ans=new ArrayList<>();if(p.length()>s.length())return ans;
        int[] need=new int[26],win=new int[26];for(char c:p.toCharArray())need[c-'a']++;
        for(int i=0;i<s.length();i++){win[s.charAt(i)-'a']++;if(i>=p.length())win[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(need,win))ans.add(i-p.length()+1);}return ans;
    }
}
