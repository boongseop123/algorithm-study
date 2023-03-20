import itertools

N, M = map(int, input().split())
card_num = list(map(int, input().split()))

# M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합
combi_sum = [sum(combi) for combi in itertools.combinations(card_num, 3) if sum(combi) <= M]

print(max(combi_sum))  # 최종 결과 : M에 최대한 가까운 카드 3장의 합