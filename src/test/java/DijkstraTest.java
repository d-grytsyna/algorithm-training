import com.dgrytsyna.graphs.Dijkstra;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DijkstraTest {

    @Test
    public void testSimpleLinearGraph() {
        // 0 -> 1 -> 2
        // Weights: 0-1: 4, 1-2: 3
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 4});
        graph.get(1).add(new int[]{2, 3});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0, 4, 7}, result);
    }

    @Test
    public void testSingleVertex() {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void testMultiplePathsChoosesShortest() {
        // Triangle: 0 -> 1 -> 2, 0 -> 2
        // Weights: 0-1: 1, 1-2: 2, 0-2: 5
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 1});
        graph.get(0).add(new int[]{2, 5});
        graph.get(1).add(new int[]{2, 2});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0, 1, 3}, result);
    }

    @Test
    public void testDisconnectedGraph() {
        // 0 -> 1, 2 (disconnected), 3 (disconnected)
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 5});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertEquals(0, result[0]);
        assertEquals(5, result[1]);
        assertEquals(Integer.MAX_VALUE, result[2]);
        assertEquals(Integer.MAX_VALUE, result[3]);
    }

    @Test
    public void testComplexGraph() {
        // More complex graph with 5 vertices
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 10});
        graph.get(0).add(new int[]{2, 5});
        graph.get(1).add(new int[]{3, 1});
        graph.get(2).add(new int[]{1, 3});
        graph.get(2).add(new int[]{3, 9});
        graph.get(3).add(new int[]{4, 2});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0, 8, 5, 9, 11}, result);
    }

    @Test
    public void testZeroWeightEdges() {
        // Test with zero-weight edges
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 0});
        graph.get(1).add(new int[]{2, 5});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0, 0, 5}, result);
    }

    @Test
    public void testSourceNotZero() {
        // Test with source vertex != 0
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(new int[]{0, 2});
        graph.get(1).add(new int[]{2, 4});
        graph.get(2).add(new int[]{3, 1});

        int[] result = Dijkstra.getShortestPath(graph, 1);

        assertArrayEquals(new int[]{2, 0, 4, 5}, result);
    }

    @Test
    public void testGraphWithCycle() {
        // Cycle: 0 -> 1 -> 2 -> 0
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new int[]{1, 1});
        graph.get(1).add(new int[]{2, 2});
        graph.get(2).add(new int[]{0, 3});

        int[] result = Dijkstra.getShortestPath(graph, 0);

        assertArrayEquals(new int[]{0, 1, 3}, result);
    }

}