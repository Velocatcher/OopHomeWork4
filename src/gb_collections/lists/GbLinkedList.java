package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList<E> implements GbList<E> {
    private int size;
    private Node<E> head;

    public GbLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void add(E value) {
        if (head == null) this.head = new Node<>(value);
        else {

            Node<E> curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node<>(value);
        }
        size++;
    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size())
            System.out.print("Такого элемента по индексу " + index + " нет ");

//            throw new IndexOutOfBoundsException("Index: " + index + " outside the List");

        else {
            Node<E> curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.value;
        }
        return null;
    }


    @Override
    public void remove(E value) {


    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0 || index >= size())
            System.out.println("Такого элемента по индексу " + index + " нет");
        else {
            if (index == 0) {
                head = head.next;
                size--;
            if (size() == 0) {
                    System.out.println("Все элементы удалены");}
                return;
            }
            int count = 0;
            Node<E> prev = null;
            Node<E> curr = head;
            while (count != index) {
                prev = curr;
                curr = curr.next;
                count++;
            }

            prev.next = curr.next;
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(toArray());
    }

    public E[] toArray() {
        int size = size();
        E[] result = null;
        try {
            result = (E[]) new Object[size];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++) {
            result[i] = get(i);

        }
        return result;
    }

//        E[] result = (E[]) new Object[size];
//        Node<E> curr = head;
//        int i = 0;
//        while (curr.next != null){
//            result[i] = curr.value;
//            curr = curr.next;
//            i++;
//        }
//        return result;
//    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        Node<E> current = head;

        while (current != null  ) {
            builder.append(current.value).append(", ");
            current = current.next;

        }

        builder.deleteCharAt(builder.length() - 2);
//                .deleteCharAt(builder.length() - 1);
        if (size() !=0)  builder.append("]");
        return builder.toString();
    }
}
