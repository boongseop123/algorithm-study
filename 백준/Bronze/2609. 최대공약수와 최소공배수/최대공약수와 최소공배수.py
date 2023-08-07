a,b = map(int,input().split())

def gcd(a, b) :
    if b==0:
        return a
    else :
        return gcd(b,a%b)

def lcm(a, b) :
    g = gcd(a,b)
    return int(g*(a/g)*(b/g))

print(gcd(a,b))
print(lcm(a,b))