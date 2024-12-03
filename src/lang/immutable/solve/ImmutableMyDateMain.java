package lang.immutable.solve;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date = new ImmutableMyDate(2025, 1, 1);
        ImmutableMyDate date1 = date;
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);

        System.out.println("2026 -> date1");
        date1 = date1.withYear(2026);
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);


    }


}
