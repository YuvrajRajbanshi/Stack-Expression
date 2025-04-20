package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deq {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addFirst(30);
        deque.addFirst(50);

        deque.removeFirst();

        System.out.println(deque);
    }

}
