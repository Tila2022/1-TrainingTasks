package homework_10;

public class Main {
    public static void main(String[] args) {
        MoveFigure[] moveFigures = new MoveFigure[2]; //Интерфейс движ. фигур
        Ellipse ellipse = new Ellipse(4, 8);
        Circle circle = new Circle(10, 16);

        moveFigures[0] = ellipse;
        moveFigures[1] = circle;

        System.out.println("Эллипс");
        ellipse.showXY();
        System.out.println("Круг");
        circle.showXY();

        for (int i = 0; i < moveFigures.length; i++) {
            moveFigures[i].move(0, 0);
        }
        System.out.println("Новые координаты Эллипса");
        ellipse.showXY();
        System.out.println("Новые координаты Круга");
        circle.showXY();
    }
}