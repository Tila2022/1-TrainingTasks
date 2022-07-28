package homework_9;

public class Square extends Rectangle {
    public Square(int x, int y, double a) {
        super(x, y, a, a); //Вызов конструктора предка
    }
}