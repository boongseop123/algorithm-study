import sys
n,m=map(int,sys.stdin.readline().split())
tmp=[i+1 for i in range (n)]
for _ in range(m):
    i,j=map(int,sys.stdin.readline().split())
    dummy=tmp[i-1]
    tmp[i-1]=tmp[j-1]
    tmp[j-1]=dummy
print(*tmp)
