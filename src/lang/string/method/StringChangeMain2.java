package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String str1 = "        Hello World Java Programming   ";

        System.out.println("str1.toLowerCase() = '" + str1.toLowerCase());
        System.out.println("str1.toUpperCase() = '" + str1.toUpperCase());

        System.out.println("str1.trim() = '" + str1.trim() + "'");
        System.out.println("str1.strip() = '" + str1.strip() + "'");

        System.out.println("str1.stripLeading() = '" + str1.stripLeading() + "'");
        System.out.println("str1.stripTrailing() = '" + str1.stripTrailing() + "'");
    }


}
