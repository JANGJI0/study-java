package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectircCar electircCar = new ElectircCar();
        electircCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
