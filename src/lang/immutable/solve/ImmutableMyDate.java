package lang.immutable.solve;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int addYear) {
        return new ImmutableMyDate(addYear, month, day);
    }

    public ImmutableMyDate withMonth(int addMonth) {
        return new ImmutableMyDate(year, addMonth, day);
    }

    public ImmutableMyDate withDay(int addDay) {
        return new ImmutableMyDate(year, month, addDay);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
