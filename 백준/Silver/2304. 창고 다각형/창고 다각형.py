n = int(input())

graph = [0]*10001
x_list = []
y_list = []

for i in range(n):
    x, y = map(int,input().split())
    graph[x] = y
    x_list.append(x)
    y_list.append(y)

maxHeight = max(y_list)
maxWidth = max(x_list)
prefix = [0]*(maxWidth+2)
suffix = [0]*(maxWidth+2)

maxPoint = []

#prefix계산
h = 0
for f in range(1,maxWidth+3):
    if(graph[f] == maxHeight):
        maxPoint.append(f)
        break
    h = max(h, graph[f])
    prefix[f] = prefix[f-1] + h

h = 0
for b in range(maxWidth,0,-1):
    if(graph[b] == maxHeight):
        maxPoint.append(b)
        break
    h = max(h, graph[b])
    suffix[b] = suffix[b+1] + h


#정답 합치기

answer = max(prefix) + max(suffix)
answer += (maxPoint[1] - maxPoint[0] + 1 )*maxHeight

print(answer)
