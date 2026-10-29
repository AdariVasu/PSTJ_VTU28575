import java.util.*;
public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30));
        list.add(1,15);list.remove(Integer.valueOf(20));
        for(int x:list)System.out.println(x);
    }
}
