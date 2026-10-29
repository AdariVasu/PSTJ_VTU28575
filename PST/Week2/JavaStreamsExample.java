import java.util.*;
import java.util.stream.*;
public class JavaStreamsExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        int sum=nums.stream().filter(x->x%2==0).map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
