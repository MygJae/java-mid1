package lang.object.solve;


public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        String string = rectangle.toString();

        System.out.println(string);
        System.out.println(rectangle);

        String hexString = Integer.toHexString(System.identityHashCode(rectangle));
        System.out.println("hexString = " + hexString);


        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(10, 20);

        boolean equals = rectangle1.equals(rectangle2);
        System.out.println("equals = " + equals);
        boolean equals1 = rectangle1 == rectangle2;
        System.out.println("equals1 = " + equals1);
    }
}
