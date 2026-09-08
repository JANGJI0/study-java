package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectircCar electircCar = new ElectircCar();
        electircCar.move();
        electircCar.charge();
        electircCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
