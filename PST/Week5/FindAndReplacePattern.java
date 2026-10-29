import java.util.*;
class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words,String pattern) {
        List<String> ans=new ArrayList<>();for(String w:words)if(match(w,pattern))ans.add(w);return ans;
    }
    private boolean match(String a,String b){Map<Character,Character>x=new HashMap<>(),y=new HashMap<>();
        for(int i=0;i<a.length();i++){char c=a.charAt(i),d=b.charAt(i);
            if(x.getOrDefault(c,d)!=d||y.getOrDefault(d,c)!=c)return false;x.put(c,d);y.put(d,c);}return true;}
}
