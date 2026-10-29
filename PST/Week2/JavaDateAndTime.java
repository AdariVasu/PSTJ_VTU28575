import java.time.*;
import java.time.format.*;
import java.util.*;
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt(), day=sc.nextInt(), year=sc.nextInt();
        System.out.println(LocalDate.of(year,month,day).getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.US).toUpperCase(Locale.ROOT));
    }
}
