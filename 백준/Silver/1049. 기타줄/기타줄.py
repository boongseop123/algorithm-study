import sys

input = sys.stdin.readline

N, M = map(int, input().split(' '))

minPack = 1001 # 주어지는 입력보다 더 큰 값으로 초기화
minSingle = 1001
for i in range(M):
  p, s = map(int, input().split(' '))
  minPack = min(minPack, p)
  minSingle = min(minSingle, s)

result = 0

# 패키지가 낱개 X 6 보다 가격이 크면 낱개로 모두가 구매한다.
if minPack > minSingle*6:
  result += N * minSingle
else:
  # 패키지가 더 저렴할 때
  # N을 6으로 나눈 몫 만큼 패키지로 구매 한다
  result += (N//6) * minPack

  # 남은 낱개의 가격이 패키지 보다 크면 패키지를 구매하고 아니면
  # 낱개로 구매한다.
  if (N%6)*minSingle > minPack:
    result += minPack
  else:
    result+= (N%6)*minSingle

print(result)