import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphDFS {
    private LinkedList<Integer> adj[];
    // array to mark visited to check
    private boolean visited[];

    public GraphDFS(int allNodes) {
        // for the obj
        adj = new LinkedList[allNodes];
        visited = new boolean[allNodes];

        for (int i = 0; i < allNodes; i++) {
            // sublist -> connected to elements in the list
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdges(int src, int dest) {
        adj[src].add(dest);
    }

    public void dfs(int startIndex) {
        // marking visited in the array to check
        visited[startIndex] = true;
        System.out.println(startIndex + " ");
        // for checking sublist
        Iterator<Integer> check = adj[startIndex].listIterator();
        while (check.hasNext()) {
            int node = check.next();
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total nodes in the graph: ");
        int allNodes = sc.nextInt();
        GraphDFS dfs = new GraphDFS(allNodes);
        System.out.println("Enter the total edges in the graph: ");
        int allEdges = sc.nextInt();

        int src, dest; // adj vertices
        for (int i = 0; i < allEdges; i++) {
            System.out.println("Enter source and destination: ");
            src = sc.nextInt();
            dest = sc.nextInt();
            dfs.addEdges(src, dest);
        }

        System.out.println("Please provide the starting index: ");
        int startIndex = sc.nextInt();
        dfs.dfs(startIndex);
        System.out.println("DFS traversal ->");
    }
}

// dfs.addEdges(0, 1);
// dfs.addEdges(0, 2);
// dfs.addEdges(0, 3);
// dfs.addEdges(1, 3);
// dfs.addEdges(2, 4);
// dfs.addEdges(3, 5);
// dfs.addEdges(3, 6);
// dfs.addEdges(4, 7);
// dfs.addEdges(4, 5);
// dfs.addEdges(5, 2);
// dfs.addEdges(6, 5);
// dfs.addEdges(7, 5);
// dfs.addEdges(7, 8);