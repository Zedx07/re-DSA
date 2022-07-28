// package Trees.Graphs;

// import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    private int vertex;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;
    private boolean visited;

    BFSTraversal(int totalNodes) {
        vertex = totalNodes;
        adj = new LinkedList[vertex];

        for (int i = 0; i < totalNodes; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }

    public void insertEdge(int v, int w) {
        adj[v].add(w);
    }

    // n -> starting node
    void BFS(int n) {
        boolean visited[] = new boolean[vertex];
        int a = 0;
        visited[n] = true;
        queue.add(n);
        while (queue.size() != 0) {
            n = queue.poll();
            System.out.println(n + " ");

            // Iterator<Integer> i = adj[n].listIterator();
            // while (i.hasNext()) {
            // int s = i.next();
            // if (!visited[s]) {
            // visited[s] = true;
            // queue.add(s);
            // }
            // }

            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!visited[a]) {
                    visited[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSTraversal graph = new BFSTraversal(10);
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
        graph.BFS(2);

    }

}
