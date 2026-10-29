import java.util.*;
public class CodeChefLapin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int t=sc.nextInt();
        while(t-->0){String s=sc.next();int[] f=new int[26];int n=s.length();
            for(int i=0;i<n/2;i++)f[s.charAt(i)-'a']++;
            for(int i=(n+1)/2;i<n;i++)f[s.charAt(i)-'a']--;
            boolean ok=true;for(int x:f)if(x!=0)ok=false;System.out.println(ok?"YES":"NO");
        }
    }
}
