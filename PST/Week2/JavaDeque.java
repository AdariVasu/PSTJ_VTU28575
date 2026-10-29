import java.util.*;
public class JavaDeque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(), k=sc.nextInt();
        int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Deque<Integer> window=new ArrayDeque<>();Map<Integer,Integer> counts=new HashMap<>();int best=0;
        for(int i=0;i<n;i++){
            window.addLast(a[i]);counts.merge(a[i],1,Integer::sum);
            if(window.size()>k){int old=window.removeFirst();counts.compute(old,(key,v)->v==1?null:v-1);}
            if(window.size()==k)best=Math.max(best,counts.size());
        }
        System.out.println(best);
    }
}
