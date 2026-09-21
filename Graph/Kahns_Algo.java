import java.util.*;

public class Kahns_Algo {
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
        System.out.println(ans);
    }
    
    public static void topologicalSort(int n, List<List<Integer>> graph, List<Integer> ans) {
        int[] in = new int[n];
        Arrays.fill(in, 0);
        for (int i = 0; i < graph.size(); i++) {
            for (int ele : graph.get(i))
                in[ele]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (in[i] == 0)
                q.add(i);
        }
        while (!q.isEmpty()) {
            int front = q.remove();
            ans.add(front);
            for (int ele : graph.get(front)) {
                in[ele]--;
                if (in[ele] == 0)
                    q.add(ele);
            }
            
        }
           
       
    }
}
