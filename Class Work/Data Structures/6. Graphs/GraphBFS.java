import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class GraphBFS {
    private List<List<Integer>> adj;
    private boolean visited[];

    // creation
    GraphBFS(int allNodes) {
        visited = new boolean[allNodes];
        adj = new LinkedList<>();

        for (int i = 0; i < allNodes; i++) {
            adj.add(i, new LinkedList<>());
        }
    }

    public void insertEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }
    // till here

    public void bfs(int startIndex) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startIndex);
        visited[startIndex] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            System.out.println(node + " ");

            List<Integer> childList = adj.get(node);
            for (Integer child : childList) {
                if (!visited[child]) {
                    queue.add(child);
                    visited[child] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(10);

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        graph.insertEdge(6, 5);
        graph.insertEdge(7, 5);
        graph.insertEdge(7, 8);

        System.out.println("BFS traversal for the given graph is: ");
        graph.bfs(0);
    }
}
