package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, World!";

        String format = String.format("num = %d, bool = %b, str = %s", num, bool, str);
        System.out.println(format);

        String format2 = String.format("숫자: %.2f", 10.123);
        System.out.println(format2);

        System.out.printf("숫자: %.2f\n", 10.123);

        String regex = "Hello, (World!|Java!)";
        System.out.println("regex.matches() = " + str.matches(regex));
    }


}
