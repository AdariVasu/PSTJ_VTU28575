import java.util.*;
public class JavaComparator {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(5, 1, 8, 2));
        values.sort(Comparator.naturalOrder());
        System.out.println(values);
        values.sort(Comparator.reverseOrder());
        System.out.println(values);
    }
}
