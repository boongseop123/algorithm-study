import sys

read = lambda: sys.stdin.readline().rstrip()

N, L = map(int, read().split())
h = list(map(int, read().split()))
h.sort()

for fruit in h:
    if fruit > L:
        break
    elif fruit <= L:
        L += 1

print(L)