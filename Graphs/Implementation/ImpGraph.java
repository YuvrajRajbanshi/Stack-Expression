package Graphs.Implementation;

import java.util.ArrayList;

public class ImpGraph {

    static class Edge {
        int src;
        int dist;
        int weight;

        public Edge(int src, int dist, int weight) {
            this.src = src;
            this.dist = dist;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // Vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // print two's neighbor or we can say destination

        for (int i = 0; i < graph[2].size(); i++) {

            Edge e = graph[i].get(i);// src, dst, wt
            System.out.println(e.dist);
        }
    }
}