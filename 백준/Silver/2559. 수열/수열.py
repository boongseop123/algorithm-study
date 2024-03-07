a,b=map(int,input().split())
arr=list(map(int,input().split()))

prefix=[0 for _ in range(a+1)] #1칸더 크게 만들기
for i in range(a):
    prefix[i+1]=prefix[i]+arr[i]# 누적합을 만든 배열

answer=[]
for k in range(b,a+1):
    answer.append(prefix[k]-prefix[k-b])
    
print(max(answer))