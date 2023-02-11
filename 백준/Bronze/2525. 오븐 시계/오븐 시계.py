h,m=map(int,input().split())
time=int(input())


h=(h+((m+time)//60))%24
m=(m+time)%60

print(h,m)
