package homework_10;

public class Ellipse extends Figure implements MoveFigure {
    public Ellipse(int x, int y) {
        super(x, y);
    }

    @Override
    public void showXY() {
        System.out.println("Координата X: " + x + " Координата Y: " + y);
    }

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
    }
}