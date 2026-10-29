import java.util.*;
public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);String s=sc.next();String expected="SOS";int changed=0;
        for(int i=0;i<s.length();i++)if(s.charAt(i)!=expected.charAt(i%3))changed++;System.out.println(changed);
    }
}
