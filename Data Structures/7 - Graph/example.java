import java.util.*;

public class GraphExample {

    // Graph class
    static class Graph {
        private Map<Integer, List<Integer>> adjacencyList; // Adjacency list representation

        // Constructor to initialize the graph
        public Graph() {
            adjacencyList = new HashMap<>(); // Initialize the adjacency list
        }

        // Method to add a vertex to the graph (O(1))
        public void addVertex(int vertex) {
            adjacencyList.putIfAbsent(vertex, new ArrayList<>()); // Add vertex if not present
        }

        // Method to add an edge to the graph (O(1))
        public void addEdge(int source, int destination) {
            adjacencyList.putIfAbsent(source, new ArrayList<>()); // Ensure source vertex exists
            adjacencyList.putIfAbsent(destination, new ArrayList<>()); // Ensure destination vertex exists
            adjacencyList.get(source).add(destination); // Add the destination to the source's list
            adjacencyList.get(destination).add(source); // Add the source to the destination's list (for undirected graph)
        }

        // Method to perform Depth-First Search (DFS) (O(V + E))
        public void dfs(int startVertex) {
            Set<Integer> visited = new HashSet<>(); // Track visited vertices
            dfsRec(startVertex, visited); // Start the recursive DFS
        }

        // Recursive DFS helper method
        private void dfsRec(int vertex, Set<Integer> visited) {
            visited.add(vertex); // Mark the vertex as visited
            System.out.print(vertex + " "); // Print the vertex

            // Visit all the adjacent vertices
            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    dfsRec(neighbor, visited); // Recur for the unvisited neighbor
                }
            }
        }

        // Method to perform Breadth-First Search (BFS) (O(V + E))
        public void bfs(int startVertex) {
            Set<Integer> visited = new HashSet<>(); // Track visited vertices
            Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

            visited.add(startVertex); // Mark the starting vertex as visited
            queue.add(startVertex); // Enqueue the starting vertex

            while (!queue.isEmpty()) {
                int vertex = queue.poll(); // Dequeue a vertex
                System.out.print(vertex + " "); // Print the vertex

                // Visit all the adjacent vertices
                for (int neighbor : adjacencyList.get(vertex)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor); // Mark as visited
                        queue.add(neighbor); // Enqueue the neighbor
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(); // Create a new graph

        // Add vertices to the graph
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        // Add edges between the vertices
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS starting from vertex 1:");
        graph.dfs(1); // Perform DFS (O(V + E))
        System.out.println();

        System.out.println("BFS starting from vertex 1:");
        graph.bfs(1); // Perform BFS (O(V + E))
    }
}

