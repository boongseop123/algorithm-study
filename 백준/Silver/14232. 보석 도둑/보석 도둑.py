K = int(input())


# 소인수 분해 최적화(logN)
def prime(k):
    x = k
    arr = []
    for i in range(2, k):
        if i * i > k:
            break

        while x % i == 0:
            arr.append(i)
            x //= i
    if x != 1:  # 만약 제곱수가 아니라면
        arr.append(x)  # 마지막 남은 수를 추가해준다.
    return arr


arr = prime(K)
print(len(arr))
print(*arr)