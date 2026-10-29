import java.util.*;
public class NaivePatternSearch {
    public static List<Integer> findAll(String text,String pattern) {
        List<Integer> indexes=new ArrayList<>();if(pattern.isEmpty())return indexes;
        for(int i=0;i+pattern.length()<=text.length();i++)if(text.startsWith(pattern,i))indexes.add(i);return indexes;
    }
    public static void main(String[] args){System.out.println(findAll("ABABABA","ABA"));}
}
