package zadanie13;

class Gadget {
    protected String name;

    public Gadget(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("Гаджет включен");
    }
}

class Smartphone extends Gadget {
    public Smartphone(String name) {
        super(name);
    }
}

class Tablet extends Gadget {
    private double screenSize;

    public Tablet(String name, double screenSize) {
        super(name);
        this.screenSize = screenSize;
    }
}

class Smartwatch extends Gadget {
    private int batteryLife;

    public Smartwatch(String name, int batteryLife) {
        super(name);
        this.batteryLife = batteryLife;
    }
}

class GadgetStore {
    private Gadget[] gadgets;
    private int count;

    public GadgetStore(int size) {
        gadgets = new Gadget[size];
    }

    public void add(Gadget g) {
        gadgets[count++] = g;
    }

    public void turnOnAll() {
        for (int i = 0; i < count; i++) {
            gadgets[i].turnOn();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GadgetStore gs = new GadgetStore(3);
        gs.add(new Smartphone("Samsung"));
        gs.add(new Tablet("iPad", 10.5));
        gs.add(new Smartwatch("Apple Watch", 24));
        gs.turnOnAll();
    }
}
