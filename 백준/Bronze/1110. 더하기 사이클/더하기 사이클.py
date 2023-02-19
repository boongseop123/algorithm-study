n = int(input())
key = n
cnt = 0

while True:
    cnt+=1
    sum = n//10 + n%10
    n = n%10*10 + sum%10
    if (n == key):
        break
print(cnt)