package homework_9;

public class Rectangle extends Figure {
    public Rectangle(int x, int y, double a, double b) {
        super(x, y, a, b); //Вызов конструктора предка
    }

    public double getSquare() {
        return a * b;
    }

    public double getPerimeter() {
        return (a + b) * 2;
    }
}