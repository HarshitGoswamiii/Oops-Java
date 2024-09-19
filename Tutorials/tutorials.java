abstract class Shape {
    abstract public void area(); // abstract class for calculating area

    abstract public void perimeter(); // abstract class for calculating perimeter

    // abstract public void volume();
}

class Square extends Shape {
    int a = 3;

    // Calculates Area
    @Override
    public void area() {
        System.out.println("Area of Square : " + a * a);
    }

    // Calcultes Perimeter
    @Override
    public void perimeter() {
        System.out.println("Perimeter of Sqaure : " + 4 * a);
    }
}

public class tutorials {
    public static void main(String[] args) {
        // Shape sh = new Shape(); ---> it throws error bcz it is abstract classs ,So it cannot be instantiated;
        Square s = new Square();
        s.area();
        s.perimeter();
    }
}
