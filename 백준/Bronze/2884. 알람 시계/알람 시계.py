hour,minute=map(int,input().split())

if minute>=45:
    print(hour,minute-45)
    
elif minute <45 and hour>=1:
    print(hour-1,60-45+minute)
    
else:
    print(23,60-45+minute)