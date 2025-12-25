package zadanie5;

class Parent {
    public void display() {
        System.out.println("Это родитель");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Это ребенок");
    }
}

class GrandChild extends Child {
    public void display() {
        System.out.println("Это внук");
    }
}

class Family {
    private Parent[] members;
    private int count;

    public Family(int size) {
        members = new Parent[size];
    }

    public void add(Parent p) {
        members[count++] = p;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            members[i].display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Family f = new Family(3);
        f.add(new Parent());
        f.add(new Child());
        f.add(new GrandChild());
        f.showAll();
    }
}
