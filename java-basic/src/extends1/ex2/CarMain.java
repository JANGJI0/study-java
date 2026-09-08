package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectircCar electircCar = new ElectircCar();
        electircCar.move();
        electircCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
