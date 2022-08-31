import java.util.Arrays;

public class networkDelayTime {
    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int N = 4;
        int K = 2;
        System.out.println(networkDelayTime(times, N, K));
    }
    public static int networkDelayTime(int[][] times, int N, int K) {
        int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = -1;
            }
        }
        for (int[] time : times) {
            graph[time[0] - 1][time[1] - 1] = time[2];
        }
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K - 1] = 0;
        boolean[] visited = new boolean[N];
        while (true) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < N; i++) {
                if (!visited[i] && dist[i] < min) {
                    min = dist[i];
                    minIndex = i;
                }
            }
            if (minIndex == -1) {
                break;
            }
            visited[minIndex] = true;
            for (int i = 0; i < N; i++) {
                if (graph[minIndex][i] != -1) {
                    dist[i] = Math.min(dist[i], dist[minIndex] + graph[minIndex][i]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max, dist[i]);
        }
        return max;
    }
}
