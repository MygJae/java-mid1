package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
//            str += "Hello World";
            sb.append("Hello World");
        }


        long endTime = System.currentTimeMillis();

//        System.out.println("str = " + str);
        System.out.println("sb = " + sb);
        System.out.println("endTime - startTime = " + (endTime - startTime) + "ms");

    }


}
