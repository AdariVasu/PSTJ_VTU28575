import java.util.*;
public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); Integer[] a = new Integer[n];
        for (int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a, (x,y) -> Integer.compare(x,y));
        for (int x:a) System.out.print(x+" ");
    }
}
