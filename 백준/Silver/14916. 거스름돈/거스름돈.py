import sys
input = sys.stdin.readline

n = int(input().rstrip())
ans = 0
while True:
    if n%5 == 0:
        ans += n//5
        break
    else:
        n-=2
        ans+=1

    if n<0:
        break

if n<0:
    print(-1)
else:
    print(ans)