package lang.object.toString;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("소나타");
        Dog dog = new Dog("진돗개",2);
        Dog dog2 = new Dog("시바견",4);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부 toString 호출");
        System.out.println(car);
        System.out.println(dog);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);

        String hexString = Integer.toHexString(System.identityHashCode(car));
        System.out.println("hexString = " + hexString);

    }


}
