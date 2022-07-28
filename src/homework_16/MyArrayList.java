package homework_16;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> { // Имплементирует методы из интерфейса
    public T[] array; // Обьявляем массив
    public int size = 0; // Cтартовый размер списка

    public MyArrayList() {
        this.array = (T[]) new Object[10]; // Конструктор массива
    }

    /*
    получение обьекта по индексу массива так же идет
    проверка что бы индекс не был меньше * 0 и больше размера массива
     */
    @Override
    public T get(int index) {
        chekIndex(index);
        return (T) array[index];
    }

    @Override
    public boolean add(T Object) { // Увеличиваестся размер массива когда больше размера
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = Object;
        size++;
        return true;
    }

    public boolean removeAt(int index) { // Удаление элемента массива по номеру
        chekIndex(index);
        if (size - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        size--;
        return true;
    }

    public void chekIndex(int index) { // Проверка на правильность индекса элемента
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}