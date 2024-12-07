package nested.inner;

public class InnerOuter {

    private static int outClassValue = 2;
    private int outInstanceValue = 5;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);

            System.out.println(outClassValue);

            System.out.println(outInstanceValue);
        }
    }

}
