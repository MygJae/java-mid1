package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound(); 컴파일 오류, Object 클래스에 sound() 메서드가 없다.
//        obj.move(); 컴파일 오류, Object 클래스에 move() 메서드가 없다.
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            dog.sound();
        } else if (obj instanceof Car) {
            Car car = (Car) obj;
            car.move();
        }
    }


}
