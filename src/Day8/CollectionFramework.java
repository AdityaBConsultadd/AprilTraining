package Day8;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        /**
         * Iterable
         * Collection
         * List:
         * -Array
         * -Linked
         * Queue
         * Set
         * */
//        Iterable
//        List

        List<Integer> list = new ArrayList();
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(6));
        System.out.println(list.size());

        List<Character> list2 = new LinkedList();
        list2.add('c');
        System.out.println(list2);

//        set
        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(34);
        set.add(1);
        System.out.println(set.size());
        System.out.println(set);

//        Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(23);
        priorityQueue.add(34);
        priorityQueue.add(325);
        System.out.println(priorityQueue);
        priorityQueue.add(345);
        priorityQueue.add(2);
        priorityQueue.add(32);
        priorityQueue.add(-345)  ;
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
//        twomap.put(1)
        map.putIfAbsent(3,"only");
        map.replace(1,"one","only");
//        map.replace()
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        System.out.println(map.get(1));




    }
}
