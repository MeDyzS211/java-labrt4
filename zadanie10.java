package zadanie10;

class Computer {
    private int processorPower;

    public Computer(int processorPower) {
        this.processorPower = processorPower;
    }

    public int getProcessorPower() {
        return processorPower;
    }
}

class Desktop extends Computer {
    public Desktop(int power) {
        super(power);
    }

    public void setGraphicsCard() {
        System.out.println("Видеокарта установлена");
    }
}

class Laptop extends Computer {
    public Laptop(int power) {
        super(power);
    }

    public void chargeBattery() {
        System.out.println("Ноутбук заряжается");
    }
}

class Tablet extends Computer {
    public Tablet(int power) {
        super(power);
    }

    public void chargeBattery() {
        System.out.println("Планшет заряжается");
    }
}

class Office {
    private Computer[] computers;
    private int count;

    public Office(int size) {
        computers = new Computer[size];
    }

    public void add(Computer c) {
        computers[count++] = c;
    }

    public void showPower() {
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i].getProcessorPower());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Office o = new Office(3);
        o.add(new Desktop(3000));
        o.add(new Laptop(2500));
        o.add(new Tablet(2000));
        o.showPower();
    }
}
