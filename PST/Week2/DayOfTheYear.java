import java.time.*;
class DayOfTheYear {
    public int dayOfYear(String date) { return LocalDate.parse(date).getDayOfYear(); }
}
