h,w=map(int,input().split())
blocks=list(map(int,input().split()))
answer=0

for i in range(1,w-1):
    left_max=max(blocks[:i])
    right_max=max(blocks[i+1:])
    
    middle=min(left_max, right_max)
    if blocks[i] < middle:
        answer+=middle-blocks[i]

print(answer)