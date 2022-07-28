package homework_10;

public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {  //Сетторы новые значения
        this.x = x;
    }

    public void setY(int y) {  //Сетторы новые значения
        this.y = y;
    }

    public abstract void showXY();
}