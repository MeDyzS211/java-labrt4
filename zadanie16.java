package zadanie16;

class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Мяу");
    }
}

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Гав");
    }
}

class Fish extends Pet {
    public Fish(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("...");
    }
}

class PetStore {
    private Pet[] pets;
    private int count;

    public PetStore(int size) {
        pets = new Pet[size];
    }

    public void add(Pet p) {
        pets[count++] = p;
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            pets[i].makeSound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PetStore ps = new PetStore(3);
        ps.add(new Cat("Мурка", 2));
        ps.add(new Dog("Бобик", 3));
        ps.add(new Fish("Немо", 1));
        ps.makeAllSounds();
    }
}
