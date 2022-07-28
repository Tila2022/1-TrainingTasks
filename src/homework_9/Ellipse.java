package homework_9;

public class Ellipse extends Figure {
    public static final double PI = 3.14;

    public Ellipse(int x, int y, double a, double b) {
        super(x, y, a, b); //Вызов конструктора предка
    }

    public double getSquare() {
        return PI * a * b;
    }

    public double getPerimeter() {
        return 4 * (PI * a * b + (a - b)) / a + b;
    }
}