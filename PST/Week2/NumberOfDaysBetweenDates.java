import java.time.*;
class NumberOfDaysBetweenDates {
    public int daysBetweenDates(String date1,String date2) {
        return (int)Math.abs(ChronoUnitDays.days(date1,date2));
    }
    static class ChronoUnitDays {
        static long days(String a,String b){return java.time.temporal.ChronoUnit.DAYS.between(LocalDate.parse(a),LocalDate.parse(b));}
    }
}
