import java.time.*;
import java.time.format.*;
public class TimeConversion {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String s=sc.next();
        DateTimeFormatter in=DateTimeFormatter.ofPattern("hh:mm:ssa",Locale.US);
        System.out.println(LocalTime.parse(s,in).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
