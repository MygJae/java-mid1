package lang.immutable.solve;

public class MyDateMain {

    public static void main(String[] args) {
        MyDate date = new MyDate(2025, 1, 1);
        MyDate date1 = date;
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);

        System.out.println("2026 -> date1");
        date1.setYear(2026);
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);


    }


}
