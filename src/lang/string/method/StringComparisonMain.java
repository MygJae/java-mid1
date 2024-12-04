package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Hello World";

        System.out.println("str1 = " + str1.equals(str2));
        System.out.println("str1 = " + str1.equalsIgnoreCase(str3));

        System.out.println("b compareTo a = " + "b".compareTo("a"));
        System.out.println("str1 = " + str1.compareTo(str3));
        System.out.println("str1 = " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 = " + str1.startsWith("Hello"));
        System.out.println("str1 = " + str1.endsWith("World"));

    }
}
