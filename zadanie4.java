package zadanie4;

class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Скорость: " + speed);
    }
}

class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    public void accelerate(int value) {
        setSpeed(getSpeed() + value);
    }
}

class Bike extends Vehicle {
    public Bike(int speed) {
        super(speed);
    }

    public void accelerate(int value) {
        setSpeed(getSpeed() + value);
    }
}

class Truck extends Vehicle {
    public Truck(int speed) {
        super(speed);
    }

    public void loadCargo() {
        setSpeed(getSpeed() - 10);
    }
}

class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage(int size) {
        vehicles = new Vehicle[size];
        count = 0;
    }

    public void add(Vehicle v) {
        vehicles[count++] = v;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            vehicles[i].move();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage(3);
        g.add(new Car(60));
        g.add(new Bike(30));
        g.add(new Truck(50));
        g.showAll();
    }
}
