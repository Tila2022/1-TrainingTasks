package homework_16;

public interface MyList<T> {
    T get(int index);
    boolean add(T Object);
    boolean removeAt(int index);
}