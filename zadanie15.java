package zadanie15;

class Furniture {
    protected String material;

    public Furniture(String material) {
        this.material = material;
    }

    public void display() {
        System.out.println("Материал: " + material);
    }
}

class Chair extends Furniture {
    public Chair(String material) {
        super(material);
    }
}

class Table extends Furniture {
    private int legs;

    public Table(String material, int legs) {
        super(material);
        this.legs = legs;
    }
}

class Sofa extends Furniture {
    private int seats;

    public Sofa(String material, int seats) {
        super(material);
        this.seats = seats;
    }
}

class FurnitureStore {
    private Furniture[] items;
    private int count;

    public FurnitureStore(int size) {
        items = new Furniture[size];
    }

    public void add(Furniture f) {
        items[count++] = f;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            items[i].display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FurnitureStore fs = new FurnitureStore(3);
        fs.add(new Chair("Дерево"));
        fs.add(new Table("Металл", 4));
        fs.add(new Sofa("Ткань", 3));
        fs.showAll();
    }
}
