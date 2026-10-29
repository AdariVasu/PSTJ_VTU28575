import java.util.*;
public class JavaLambdaExpressions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Anu", "Kumar");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        names.forEach(name -> System.out.println(name));
    }
}
