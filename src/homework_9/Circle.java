package homework_9;

public class Circle extends Ellipse {
    public Circle(int x, int y, double a) {
        super(x, y, a, a); //Вызов конструктора предка
    }
}