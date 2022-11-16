def change(x):
    # mutable 변경 방지 .
    # x = x[:]
    # x[0] = 'H'
    x = 5
    
s = ['J','A','M']
a = 3
change(a)
print(a)