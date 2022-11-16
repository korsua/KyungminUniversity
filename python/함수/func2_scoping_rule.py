g = 1

def scoping(a):
    global g
    g += a
print(g)
scoping(5)
print(g)