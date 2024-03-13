import sys 
input = sys.stdin.readline

n, m = map(int,input().split())

array = []
for _ in range(n):
    array.append(list(map(int,input().split())))

sum_dp = [[0] * (n + 1) for _ in range(n + 1)]
for i in range(1, n + 1):
    for j in range(1, n + 1):
        sum_dp[i][j] = sum_dp[i][j-1] + sum_dp[i-1][j] - sum_dp[i-1][j-1] + array[i-1][j-1]

for _ in range(m):
    x1, y1, x2, y2 = map(int,input().split())

    ans = sum_dp[x2][y2] - sum_dp[x2][y1-1] - sum_dp[x1-1][y2] + sum_dp[x1-1][y1-1]
    print(ans)