package zadanie6;

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Зарплата: " + salary);
    }
}

class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }

    public void increaseSalary(int value) {
        setSalary(getSalary() + value);
    }
}

class Intern extends Employee {
    public Intern(int salary) {
        super(salary);
    }

    public void study() {
        System.out.println("Стажер учится");
    }
}

class Director extends Employee {
    public Director(int salary) {
        super(salary);
    }

    public void makeDecision() {
        System.out.println("Директор принял решение");
    }
}

class Company {
    private Employee[] employees;
    private int count;

    public Company(int size) {
        employees = new Employee[size];
    }

    public void add(Employee e) {
        employees[count++] = e;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            employees[i].showSalary();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company c = new Company(3);
        c.add(new Manager(50000));
        c.add(new Intern(20000));
        c.add(new Director(80000));
        c.showAll();
    }
}
