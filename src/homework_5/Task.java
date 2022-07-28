package homework_5;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №5");
        System.out.println("Вывести минимальную цифру из чисел последовательности оканчивающихся на -1");
        int[] numbers = {345, 298, 456}; //Массив чисел
        System.out.println(Arrays.toString(numbers)); // Вывод массива для задачи
        Arrays.sort(numbers); //Сортируем массив
        System.out.println("Минимальное число для всей последовательности " + (numbers[0])); // Выводим минимальное число
        System.out.println("Программа завершена");
    }
}