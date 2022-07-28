package homework_9;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Figure(1, 2, 3, 4);
        figures[1] = new Ellipse(5, 6, 7, 8);
        figures[2] = new Rectangle(9, 10, 11, 12);
        figures[3] = new Square(13, 14, 15);
        figures[4] = new Circle(17, 18, 19);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i] + " Координата X = " + figures[i].x + " Координата Y = " + figures[i].y);
            System.out.println("Периметр = " + figures[i].getPerimeter() + " Площадь = " + figures[i].getSquare());
            System.out.println("----------------");
        }
    }
}