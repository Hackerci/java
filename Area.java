//~Interface Area is having method calculateArea(). Calculate the area for the following classes: Square, Circle, Triangle, Rectangle

interface Area {
    void calculateArea();
}

class Square implements Area {
    public void calculateArea() {
        double l = 6.8;
        System.out.println("Area of square is: " + l * l);
    }
}

class Circle implements Area {
    public void calculateArea() {
        double r = 6.8;
        System.out.println("Area of Circle is: " + 3.14 * r * r);
    }
}

class Triangle implements Area {
    public void calculateArea() {
        double h = 6.8;
        double b = 6.8;
        System.out.println("Area of triangle is: " + .5 * (h * b));
    }
}

class Rectangle implements Area {
    public void calculateArea() {
        double l = 6.8;
        double w = 6.8;
        System.out.println("Area of rectangle is: " + l * w);
    }
}

public class chit24 {
    public static void main(String[] args) {
        Square s = new Square();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        s.calculateArea();
        c.calculateArea();
        t.calculateArea();
        r.calculateArea();

    }
}