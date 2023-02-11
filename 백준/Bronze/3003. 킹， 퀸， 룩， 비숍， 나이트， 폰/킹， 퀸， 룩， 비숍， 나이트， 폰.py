chess=[1,1,2,2,2,8]#체스 리스트 생성
myList=list(map(int,input().split()))

for i in range(len(chess)):
    print(chess[i]-myList[i],end=' ')