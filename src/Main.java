

import gb_collections.GbList;
import gb_collections.lists.GbArrayList;
import gb_collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
//        GbList<Integer> list = new GbArrayList<>();
//        list.add(5);
//        list.add(9);
//        list.add(66);
//        list.add(8);
//        list.add(5);
//        list.add(9);
//        list.add(66);
//        list.add(8);
//        list.add(5);
//        list.add(9);
//        list.add(66);
//        list.add(8);
//        System.out.println(list.size());
//        System.out.println(list);
//        list.removeByIndex(1);
//        list.remove(66);
//        System.out.println(list);
//        GbList<String> s = new GbArrayList<>();
//        s.add("asdf");
//        s.add("xcdf");
//        s.add("hjdf");
//        s.add("lkjf");
//        System.out.println(s);

        GbList<Integer> list2 = new GbLinkedList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("\033[H\033[J");
        System.out.println(list2.size());
        System.out.println(list2);
        System.out.println(list2.get(5));
        System.out.println(list2.get(2));
        list2.removeByIndex(0);
        System.out.println(list2);
        list2.removeByIndex(0);
        System.out.println(list2);
        list2.removeByIndex(0);
        System.out.println(list2);
        list2.removeByIndex(0);
        System.out.println(list2);


    }
}