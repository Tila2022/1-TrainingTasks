package homework_8;

import java.util.ArrayList;
import java.util.Comparator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Human> arrayList = new ArrayList<>(); // Динамический массив человек
        for (int i = 0; i < 10; i++) {
            double randomWeight = (50 + Math.random() * 50); // Создаём вес человека
            Human human = new Human("Human" + i, randomWeight); // Создаём имя человека
            arrayList.add(human); // Добавляем в массив
        }
        System.out.println("До");
        for (Human people : arrayList) { // Перебор массива
            System.out.println(people.toString()); // Вывод людей из диннамического массива
        }
        System.out.println("После");
        arrayList.sort(Comparator.comparing(Human::getWeight));
        for (Human people : arrayList) { // Перебор массива
            System.out.println(people.toString()); // Вывод людей из диннамического массива
        }
    }
}