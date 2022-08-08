package homework_6;

import java.util.Arrays;

public class Task {
    public static int serchElement(int[] RA, int number) { //Поиск индекса массива по числу
        for (int i = 0; i < RA.length; i++) {
            if (RA[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] RA) {
        for (int i = 0; i < RA.length; i++) { //
            for (int j = 1 + i; j < RA.length; j++) {
                int temp = RA[i];
                if (temp < RA[j]) {
                    int x = RA[j];
                    RA[i] = x;
                    RA[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        System.out.println("Дано: " + Arrays.toString(numbers));
        System.out.println("Ответ:" + Arrays.toString(numbers));
        System.out.println(serchElement(numbers, 14)); // Поиск определённого числа
        serchElement(numbers, 20);
        sort(numbers);
        System.out.println(serchElement(numbers, 14)); // Поиск определённого числ
    }
}
