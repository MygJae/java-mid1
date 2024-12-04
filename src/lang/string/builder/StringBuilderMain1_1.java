package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println("sb = " + sb);

        sb.insert(5, " Java");
        System.out.println("sb = " + sb);

        sb.delete(5, 10);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        String str = sb.toString();
        System.out.println("str = " + str);
    }


}
