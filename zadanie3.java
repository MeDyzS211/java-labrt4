package zadanie3;

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }
}

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }
}

class Triangle extends Shape {
    private double b, h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return b * h / 2;
    }
}

class Drawing {
    private Shape[] shapes;
    private int count;

    public Drawing(int size) {
        shapes = new Shape[size];
    }

    public void add(Shape s) {
        shapes[count++] = s;
    }

    public double totalArea() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += shapes[i].getArea();
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Drawing d = new Drawing(3);
        d.add(new Circle(2));
        d.add(new Square(3));
        d.add(new Triangle(4, 5));
        System.out.println(d.totalArea());
    }
}
