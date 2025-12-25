package zadanie2;

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

class Student extends Person {
    private String cardNumber;

    public Student(String name, int age, String cardNumber) {
        super(name, age);
        this.cardNumber = cardNumber;
    }

    public void info() {
        System.out.println(name + " " + age + " " + cardNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void info() {
        System.out.println(name + " " + age + " " + subject);
    }
}

class Principal extends Person {
    private String level;

    public Principal(String name, int age, String level) {
        super(name, age);
        this.level = level;
    }

    public void info() {
        System.out.println(name + " " + age + " " + level);
    }
}

class School {
    private Person[] people;
    private int count;

    public School(int size) {
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
        School school = new School(3);
        school.add(new Student("Иван", 18, "123"));
        school.add(new Teacher("Олег", 40, "Математика"));
        school.add(new Principal("Анна", 50, "Старшая"));
        school.showAll();
    }
}
