import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] arr = new int[W];
        int answer = 0;
        for (int i = 0; i < W; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < W - 1; i++) {
            int current = arr[i]; //현재 벽 높이
            int leftMax = current; //왼쪽 벽 최대높이
            int rightMax = current; //오른쪽 벽 최대높이
            for (int k = i - 1; k >= 0; k--) { //왼쪽 최대벽 높이 탐색
                if (arr[k] > current) {
                    leftMax = Math.max(leftMax, arr[k]);
                }
            }
            for (int k = i + 1; k < W; k++) { //오른쪽 최대벽 높이 탐색
                if (arr[k] > current) {
                    rightMax = Math.max(rightMax, arr[k]);
                }
            }
            if (Math.min(leftMax, rightMax) > current) { // 현재 벽보다 높은 벽이 양쪽에 있는 경우
                answer += (Math.min(leftMax, rightMax) - arr[i]);
            }
        }
        System.out.println(answer);
    }
}