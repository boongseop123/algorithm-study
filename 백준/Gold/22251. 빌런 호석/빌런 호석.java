import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result = 0, N, P, K, X;
    static int[][] arr = {
            {0, 4, 3, 3, 4, 3, 2, 3, 1, 2},
            {4, 0, 5, 3, 2, 5, 6, 1, 5, 4},
            {3, 5, 0, 2, 5, 4, 3, 4, 2, 3},
            {3, 3, 2, 0, 3, 2, 3, 2, 2, 1},
            {4, 2, 5, 3, 0, 3, 4, 3, 3, 2},
            {3, 5, 4, 2, 3, 0, 1, 4, 2, 1},
            {2, 6, 3, 3, 4, 1, 0, 5, 1, 2},
            {3, 1, 4, 2, 3, 4, 5, 0, 4, 3},
            {1, 5, 2, 2, 3, 2, 1, 4, 0, 1},
            {2, 4, 3, 1, 2, 1, 2, 3, 1, 0}
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//N층까지
        K = Integer.parseInt(st.nextToken());//자리수 <= 6
        P = Integer.parseInt(st.nextToken());//최대 반전 수
        X = Integer.parseInt(st.nextToken());//현재 층

        solve(0, 1, 0, 0);
        System.out.println(result - 1);
    }

    public static void solve(int idx, int temp, int su, int flipCnt){
        if(flipCnt > P || su > N) return;//최대 반전 수 넘으면 return
        if(idx == K){
            if(su!=0) result++;
            return;
        }

        for(int i=0; i<=9; i++){
            solve(idx+1, temp*10, i*temp + su, flipCnt + arr[X/temp%10][i]);
        }
    }
}