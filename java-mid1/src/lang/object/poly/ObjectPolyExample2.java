package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        // Object[] objects = new Object[3];
        // object[0] = dog;
        // object[1] = car;
        // object[2] = object; 와 같은코드
        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
