package homework_16;

public class main {

    public static void main(String[] args) {
        MyArrayList<Integer> arraylist = new MyArrayList<>(); // Создаём ArrayList
        arraylist.add(5); // Добавляем числа
        arraylist.add(10);
        arraylist.add(15);
        arraylist.add(20);
        arraylist.add(25);
        System.out.println("ArrayList");
        System.out.println("Выводим число под индексом 2 - " + arraylist.get(2));
        arraylist.removeAt(2); // Убираем число под индексом 2
        System.out.println("Выводим новое число под индексом 2 - " + arraylist.get(2));

        MyList<Integer> linkedlist = new MyLinkedList<>(); // Создаём LinkedList
        linkedlist.add(4); // Добавляем числа
        linkedlist.add(9);
        linkedlist.add(14);
        linkedlist.add(19);
        linkedlist.add(24);
        System.out.println(" ");
        System.out.println("LinkedList");
        System.out.print("Выводим число по индексу 0 - " + linkedlist.get(0));
    }
}