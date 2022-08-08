package homework_5;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {345, 298, 456}; //Массив чисел
        Arrays.sort(numbers); //Сортируем массив
        System.out.println("Минимальное число для всей последовательности " + (numbers[0])); // Выводим минимальное число
    }
}
