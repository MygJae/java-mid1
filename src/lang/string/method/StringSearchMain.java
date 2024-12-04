package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("str.contains() = " + str.contains("Hello"));
        System.out.println("str.indexOf() = " + str.indexOf("World"));
        System.out.println("str.indexOf() = " + str.indexOf("World", 10));
        System.out.println("str.lastIndexOf() = " + str.lastIndexOf("o"));

    }


}
