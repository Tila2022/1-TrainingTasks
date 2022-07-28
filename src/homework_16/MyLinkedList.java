package homework_16;

public class MyLinkedList<T> implements MyList<T> {
    public Node first; // Хранение первой ссылки
    public Node last; // Хранение последней ссылки
    public int size = 0; // Стартовый размер списка

    public class Node { // Внутренний класс (узел) LinkedList
        public Node previous; // Хренение ссылки на предыдущий узел
        public T value; // Хранение значений разного типа
        public Node next; // Хранение ссылки на следующий  узел

        public Node(Node previous, T value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

    public T get(int index) { // Получние элемента по индексу
        return getNode(index).value; // Возвращает данные(value) узла
    }

    public boolean add(T Object) { // Добавление элемента в List если размер List равно 0
        if (size == 0) {
            first = new Node(null, Object, null);
            last = first;
        } else {
            Node secondLast = last;
            last = new Node(secondLast, Object, null);
            secondLast.next = last;
        }
        size++;
        return true;
    }

    public Node getNode(int index) { // Получение элемента через индекс
        if (index < 0 || index >= size) { // Вызывается ошибка если происходит выход за размер списка
            throw new IndexOutOfBoundsException();
        }
        Node node = first; // Берется первый элемент списка по индексу(0)
        for (int i = 0; i < index; i++) { // Через цикл проходим от 0 до нашего искомого индекса
            node = node.next; // На каждой итерации перезаписываем текущий узел на следующий в списке
        }
        return node; // Возвращаем последную итеррацию перезаписи
    }

    @Override
    public boolean removeAt(int index) { // Лишний метод Т.К. есть в MyList
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }
}