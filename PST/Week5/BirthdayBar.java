import java.util.*;
public class BirthdayBar {
    public static int birthday(List<Integer>s,int d,int m){int count=0,sum=0;for(int i=0;i<s.size();i++){sum+=s.get(i);if(i>=m)sum-=s.get(i-m);if(i>=m-1&&sum==d)count++;}return count;}
}
