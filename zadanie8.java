package zadanie8;

class Appliance {
    private String model;

    public Appliance(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {
        System.out.println("Прибор включён");
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(String model) {
        super(model);
    }

    public void turnOn() {
        System.out.println("Стиральная машина включена");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String model) {
        super(model);
    }

    public void turnOn() {
        System.out.println("Холодильник включен");
    }
}

class Oven extends Appliance {
    public Oven(String model) {
        super(model);
    }

    public void turnOn() {
        System.out.println("Духовка включена");
    }
}

class House {
    private Appliance[] appliances;
    private int count;

    public House(int size) {
        appliances = new Appliance[size];
    }

    public void add(Appliance a) {
        appliances[count++] = a;
    }

    public void turnOnAll() {
        for (int i = 0; i < count; i++) {
            appliances[i].turnOn();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        House h = new House(3);
        h.add(new WashingMachine("LG"));
        h.add(new Refrigerator("Samsung"));
        h.add(new Oven("Bosch"));
        h.turnOnAll();
    }
}
