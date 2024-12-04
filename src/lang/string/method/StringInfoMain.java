package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("str1.length() = " + str1.length());
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str1.isBlank() = " + str1.isBlank());
        System.out.println("str1.isBlank() = " + "    ".isBlank());

        char c = str1.charAt(6);
        System.out.println("c = " + c);
    }

}
