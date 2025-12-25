package zadanie11;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + age);
    }
}

class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println("Работаю");
    }
}

class Doctor extends Person {
    public Doctor(String name, int age) {
        super(name, age);
    }

    public void diagnose() {
        System.out.println("Осматриваю пациента");
    }
}

class Engineer extends Person {
    public Engineer(String name, int age) {
        super(name, age);
    }

    public void design() {
        System.out.println("Проектирую");
    }
}

class Hospital {
    private Person[] people;
    private int count;

    public Hospital(int size) {
        people = new Person[size];
    }

    public void add(Person p) {
        people[count++] = p;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            people[i].info();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital(3);
        h.add(new Worker("Иван", 30));
        h.add(new Doctor("Анна", 40));
        h.add(new Engineer("Олег", 35));
        h.showAll();
    }
}
