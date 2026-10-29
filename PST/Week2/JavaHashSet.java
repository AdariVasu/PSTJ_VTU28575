import java.util.*;
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();Set<String> pairs=new HashSet<>();
        for(int i=0;i<n;i++){String a=sc.next(),b=sc.next();pairs.add(a+" "+b);System.out.println(pairs.size());}
    }
}
