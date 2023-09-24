import java.util.*;

/*
[백준] 2583번 - 영역 구하기 (Java)
*/

public class Main {
    static int M, N, K;
    static int A[][];    
    static boolean visited[][];

    void InputData() {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        K = in.nextInt();
        A = new int[M][N];
        
        for (int i=0; i<K; i++) {
            int y1 = in.nextInt();
            int x1 = in.nextInt();
            int y2 = in.nextInt();
            int x2 = in.nextInt();
            for (int x=x1; x<x2; x++) {
                for (int y=y1; y<y2; y++) {
                    A[x][y] = 1;//좌표의 범위만큼 사각형을 1로 채운다
                }
            }
        }
    }

    int dx[] = {-1, 0, 1, 0};
    int dy[] = {0, 1, 0, -1};
    void DFS(int x, int y, int count) {
        visited[x][y] = true;
        max = Math.max(max, count);
        //System.out.println("DFS("+x+", "+y+", "+count+")");
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
            if (A[nx][ny] == 1) continue;
            if (visited[nx][ny]) continue;
            DFS(nx, ny, max+1);//다시 돌아갔을 때 stack에는 이전 count값이 사용되므로 최신 max를 count 대신 사용한다.
        }
    }

    int max = 0;
    void Solve() {
        ArrayList<Integer> list = new ArrayList<>();
        visited = new boolean[M][N];
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (visited[i][j]) continue;
                if (A[i][j] == 1) continue;
                DFS(i, j, 1);
                list.add(max);
                max = 0;
            }
        }

        System.out.println(list.size());
        Collections.sort(list);        
        for (int x : list)
            System.out.print(x+" ");
    }
    
	public static void main(String[] args) {
		Main m = new Main();
        m.InputData();
        m.Solve();
	}
}