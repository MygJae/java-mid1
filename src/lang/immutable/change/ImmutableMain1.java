package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj1 = obj.add(5);

        System.out.println("obj = " + obj.getValue());
        System.out.println("obj1 = " + obj1.getValue());
    }
}
