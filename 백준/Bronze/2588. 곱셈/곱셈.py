a=int(input())
b=input()
print(a*int(b[2]))#a*(b%10)
print(a*int(b[1]))#a*((b%100)//10)
print(a*int(b[0]))#a*(b%100)
print(a*int(b))

#a,b를 둘다 실수로 받은 후
#나머지 연산과 몫연산을 이용해서 풀 수도 있다.
