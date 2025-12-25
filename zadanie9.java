package zadanie9;

class Figure {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Figure {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}

class Triangle extends Figure {
    private double b, h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return b * h / 2;
    }
}

class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }
}

class Geometry {
    private Figure[] figures;
    private int count;

    public Geometry(int size) {
        figures = new Figure[size];
    }

    public void add(Figure f) {
        figures[count++] = f;
    }

    public double totalArea() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += figures[i].getArea();
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Geometry g = new Geometry(3);
        g.add(new Rectangle(3, 4));
        g.add(new Triangle(4, 5));
        g.add(new Circle(2));
        System.out.println(g.totalArea());
    }
}
