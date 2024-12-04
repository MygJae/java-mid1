package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Hello,World,Java";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }

        String join = String.join("-", split);
        System.out.println("join = " + join);
    }

}
