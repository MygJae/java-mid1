package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 5;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

            // System.out.println(outInstanceValue); // 컴파일 에러

            System.out.println(new NestedOuter().outClassValue);
            System.out.println(new NestedOuter().outInstanceValue);

        }
    }


}
