package PriorityQueue;

import java.util.ArrayList;

public class HeapImplem {

    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int val) {
            list.add(val); // Fixed here

            int x = list.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && list.get(x) < list.get(par)) {
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return list.get(0);
        }

        public int remove() {
            int val = list.get(0);

            int lastIndex = list.size() - 1;
            list.set(0, list.get(lastIndex));
            list.remove(lastIndex);

            heapify(0);
            return val;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int mindx = i;

            if (left < list.size() && list.get(mindx) > list.get(left)) {
                mindx = left;
            }

            if (right < list.size() && list.get(mindx) > list.get(right)) {
                mindx = right; // Fixed here
            }

            if (mindx != i) {
                int temp = list.get(i);
                list.set(i, list.get(mindx));
                list.set(mindx, temp);

                heapify(mindx);
            }
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);

        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
