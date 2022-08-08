package homework_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int minCount = Integer.MAX_VALUE; // Максимальное значение int
        int tecCount = 0; // Подсчёт
        Scanner scanner = new Scanner(System.in); // Ввод в консоли
        //ArrayList <Массив для обьектов>
        ArrayList<Integer> arrayNum = new ArrayList<>(); //ArrayList Динамический Массив
        //------------------------------------------------------
        int number = 0;
        int count;
        System.out.println("Введите последовательность чисел");
        // задаем последовательность в диапозоне -100 до 100 и выход при -1;
        while (number != -1) {
            number = scanner.nextInt();
            if (number < 100 && number > -100 && number != -1) {
                arrayNum.add(number);
            }
        }
        System.out.println("Ваша последовательность");
        for (Integer num : arrayNum) {
            System.out.println(num);
        }
        System.out.println("Минимально повторяющиеся элементы это: ");
        //----------------------------------------------------------
        // поиск минимального повторения
        for (int i = 0; i < arrayNum.size(); i++) {
            count = 0;
            for (int j = 0; j < arrayNum.size(); j++) {
                if (arrayNum.get(i).equals(arrayNum.get(j)) && i != j) { // equals равно для обьектов
                    count++;
                    tecCount = count;
                }
            }
            if (count == 0) {
                minCount = count;
            }
            if (tecCount < minCount) {
                minCount = tecCount;
            }
        }
        //----------------------------------------------------------
        // поиск элементов по миниальному повторению
        for (int i = 0; i < arrayNum.size(); i++) {
            count = 0;
            for (int j = 0; j < arrayNum.size(); j++) {
                if (arrayNum.get(i).equals(arrayNum.get(j)) && i != j) {
                    count++;
                }
            }
            if (count == minCount) {
                System.out.println("Все числа повторяются по " + (minCount + 1) + " раз");
                System.out.println(arrayNum.get(i));
            }
        }
    }
}
