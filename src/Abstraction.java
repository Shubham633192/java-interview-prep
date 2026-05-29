abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle drawing");
    }

}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle drawing");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.draw();

        Rectangle c2 = new Rectangle();
        c2.draw();

    }

}
