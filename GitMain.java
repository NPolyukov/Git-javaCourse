package gitprojekt;

public class GitMain {
    public static void main(String[] args) {
        Car car = new Car("V6","Red",5);
        System.out.println(car.getMotor());
        System.out.println(car.getColor());
        System.out.println(car.getNumPassenger());

    }
}
