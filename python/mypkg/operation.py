def add(a,b):
    return a+b
def mul(a,b):
    return a*b
def print_name():
    print(__name__)

# 단독으로 프로그램 실행하는 경우 
if __name__ == '__main__': 
    print(__name__, 'main 에서 실행됌') 
    print(add(10,20))
    print(mul(10,20))
else: 
    print(__name__ , '임포트되어사용됌')