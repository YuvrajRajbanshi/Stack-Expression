package PriorityQueue;

import java.util.PriorityQueue;

public class PQObj {

    public static class Students implements Comparable<Students> {

        String name;
        int rank;

        public Students(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        public int compareTo(Students s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
        pq.add(new Students("Yuvraj", 10));
        pq.add(new Students("Apna", 2));
        pq.add(new Students("Sher", 3));
        pq.add(new Students("Diler", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "  " + pq.peek().rank);
            pq.poll();
        }
    }

}
