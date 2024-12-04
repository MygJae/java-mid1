package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("Hello"); //x001
        String str2 = new String("Hello"); //x002
        System.out.println("new String() == 비교: " + isSame(str1, str2));

        String str3 = "Hello"; //x003
        String str4 = "Hello"; //x004
        System.out.println("리터럴 == 비교: " + isSame(str3, str4));
      }

    private static boolean isSame(String str1, String str2) {
        return str1 == str2;
//        return str1.equals(str2);
    }

}
