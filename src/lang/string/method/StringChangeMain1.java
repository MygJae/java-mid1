package lang.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String str1 = "Hello World Java Programming";

        System.out.println("str1.substring(7) = " + str1.substring(7));
        System.out.println("str1.substring(7, 12) = " + str1.substring(7, 12));

        System.out.println("str1.concat() = " + str1.concat(" Kotlin"));

        System.out.println("str1.replace('o', 'O') = " + str1.replace("Hello", "AAA"));
    }


}
