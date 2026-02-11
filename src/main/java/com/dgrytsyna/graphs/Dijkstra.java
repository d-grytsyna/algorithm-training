package com.dgrytsyna.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {

    public static int[] getShortestPath(ArrayList<ArrayList<int[]>> graph, int source ) {
        int V = graph.size();

        // {distance, vertex}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[source] = 0;

        // {distance, vertex}
        pq.offer(new int[]{0, source});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0];
            int u = top[1];

            if (d > dist[u])
                continue;

            // go through neighbours
            for (int[] p : graph.get(u)) {
                // {vertex, weight}
                int v = p[0];
                int w = p[1];

                // check if the distance in the array is already shorter
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{dist[v], v});
                }
            }
        }
        return dist;
    }
}
