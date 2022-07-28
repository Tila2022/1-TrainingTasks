package homework_8;

public class Human {
    public String name;
    public double weight;
    public Human(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Имя = '" + name + '\'' + ", Вес = " + weight;
    }
}