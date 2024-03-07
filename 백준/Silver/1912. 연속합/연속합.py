a=int(input())
arr=list(map(int,input().split()))

prefix=[0 for _ in range(a+1)]
answer=[]

for i in range(a):
    prefix[i+1]=max(prefix[i]+arr[i],arr[i])
    answer.append(prefix[i+1])
    
print(max(answer))
