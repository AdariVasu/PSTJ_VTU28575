import java.util.*;
public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0){String a=sc.next(),b=sc.next();boolean[] seen=new boolean[256];
            for(char c:a.toCharArray())if(c<256)seen[c]=true;boolean ok=false;for(char c:b.toCharArray())if(c<256&&seen[c]){ok=true;break;}
            System.out.println(ok?"YES":"NO");}
    }
}
