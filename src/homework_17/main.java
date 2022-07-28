package homework_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Ввод в консоль
        String string = scanner.nextLine(); // Ввод предложения
        Map<String, Integer> map = new HashMap<>(); //  Создание коллекции Map

        String[] text = string.split(" "); // Для деления текста по словам

        for (int i = 0; i < text.length; i++) { // Цикл
            int values = 1;
            for (int j = 0; j < text.length; j++) {
                if (text[i].equals(text[j]) && i != j) {
                    values++;
                }
                map.put(text[i], values);
            }
        }
        for (String name : map.keySet()) { // Цикл
            String word = name;
            String value = map.get(word).toString();
            System.out.println(word + " = " + value);
        }
    }
}