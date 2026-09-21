import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopologicalSort {
        
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 4 }, { 1, 3 }, { 2, 3 } };
        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
        }
        topologicalSort(V, graph, ans);
        Collections.reverse(ans);
        System.out.println(ans);
    }

    public static void topologicalSort(int n, List<List<Integer>> graph, List<Integer> ans) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                dfs(graph, ans, i, visited);
        }
    }

    public static void dfs(List<List<Integer>> graph, List<Integer> ans, int i,boolean[] visited ) {
        visited[i] = true;
        for (int ele : graph.get(i)) {
            if (!visited[ele])
                dfs(graph, ans, ele, visited);
        }
        ans.add(i);
    } 
}
