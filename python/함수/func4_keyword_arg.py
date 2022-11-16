

def hello(s3,s2,s1):
    print("first Student : " + s1) # result ==> s1 == 'A'

hello(s1= 'A', s2= 'B', s3= 'C')

def hello2(*s3):
    print(len(s3))
    for s in s3:
        print(s)
    
hello2(1,2,3,4,5)
    
print("dict")
def hello3(**s3):
    print(type(s3))
    print(len(s3))
    for i,j in s3.items():
        print(i , j)
        
hello3(한식 = "gd", 중식 ="짱봉")

# 입력받은 숫자를 다 더하는 함수 
def sum(*n: int) -> int:
    res = 0
    for i in n:
        res += i
    return res

print(sum(1,2,3,4,5))

add = lambda x : x + 10
print(add(10))