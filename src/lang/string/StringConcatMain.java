package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
    }
}
