package gitprojekt;

public class Car {
    private String motor;
    private String color;
    private int numPassenger;

    public Car(String motor, String coulor, int numPassenger) {
        this.motor = motor;
        this.color = color;
        this.numPassenger = numPassenger;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
    }
}
