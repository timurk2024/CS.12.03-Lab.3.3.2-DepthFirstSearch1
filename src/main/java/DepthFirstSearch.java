import java.util.Stack;

public class DepthFirstSearch {

    // Main method. Used for visualising and debugging purposes.
    public static void main(String[] args) {

        int[][] graph1 = {
                {6,9},
                {11},
                {6,7},
                {9},
                {5,8},
                {4,7},
                {0,2,11},
                {2,5},
                {4,10},
                {0,3},
                {8},
                {1,6}
        };

        int[][] graph2 = {
                {3,6,5,9},
                {11},
                {7,10},
                {0},
                {5},
                {0,4,7},
                {0,11},
                {2,5,8},
                {7},
                {0},
                {2},
                {1,6}
        };

        int[] path_graph_1 = depthFirstSearch(graph1);
        int[] path_graph_2 = depthFirstSearch(graph2);

        printPath(path_graph_1);
        printPath(path_graph_2);

    }

    public static int[] depthFirstSearch(int[][] graph) {
        Stack<Integer> stack = new Stack<>(); // Create a stack
        boolean[] visited = new boolean[graph.length]; // Track visited nodes
        int[] path = new int[graph.length]; // The path of nodes visited
        int pathIndex = 0; // Index for the path array

        // Start DFS at node 0
        stack.push(0); // Push starting node onto stack
        visited[0] = true; // Mark as visited

        while (!stack.empty()) {
            int current = stack.pop(); // Pop current node from stack
            path[pathIndex++] = current; // Add to path

            // Get all adjacent nodes
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark neighbor as visited
                    stack.push(neighbor); // Push onto stack
                }
            }
        }

        // Adjust the path array to the correct size
        int[] finalPath = new int[pathIndex];
        System.arraycopy(path, 0, finalPath, 0, pathIndex);

        return finalPath;
    }

    // A private helper method that prints the path. Used for visualisation and debugging purposes.
    private static void printPath(int[] path) {

        for (int node: path) System.out.print(node + " ");
        System.out.println();

    }

}
