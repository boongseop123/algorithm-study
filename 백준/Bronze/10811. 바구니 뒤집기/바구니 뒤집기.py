n,m = map(int, input().split())
basket = [i+1 for i in range(n)]
for _ in range(m):
    i, j = map(int, input().split())
    basket = basket[:i-1] + basket[i-1:j][::-1] + basket[j:]
for i in basket:
    print(i, end = ' ')