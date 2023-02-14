total=int(input())
money=0

n=int(input())

for i in range(1,n+1):
    a,b=map(int,input().split())
    money = money+a*b
    
if money == total:
    print("Yes")
else:
    print("No")