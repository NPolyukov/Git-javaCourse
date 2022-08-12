package gitprojekt;

public class GitMain {
    public static void main(String[] args) {
        Car car = new Car("V6","Red",5);
        System.out.println(car.getMotor());
        System.out.println(car.getColor());
        System.out.println(car.getNumPassenger());
        Car car1 = new Car("v8","Blue",3);
        System.out.println(car1.getMotor());
        System.out.println(car1.getColor());
        System.out.println(car1.getNumPassenger());

    }
}
