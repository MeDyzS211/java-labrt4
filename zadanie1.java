package lab1;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Гав");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Мяу");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Чик-чирик");
    }
}

class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo(int size) {
        animals = new Animal[size];
        count = 0;
    }

    public void add(Animal a) {
        if (count < animals.length) {
            animals[count++] = a;
        }
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3);
        zoo.add(new Dog("Шарик", 3));
        zoo.add(new Cat("Мурка", 2));
        zoo.add(new Bird("Кеша", 1));
        zoo.makeAllSounds();
    }
}
