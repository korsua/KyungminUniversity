try:
    a = [1,2]
    print(0/1)
    print(a[3])
# except ZeroDivisionError as el: 
#     print("Error division by zero")
#     print(el.__doc__)
#     print(el)
# except IndexError as el:
#     print("Error Index")
#     print(el.__doc__)
#     print(el)
except (IndexError, ZeroDivisionError) as el:
    print(el)
except :
    print("예외발생")
else : 
    print("다 잘 처리되었습니다. ")
finally :
    print("예외처리문 끝 .")

try: 
    f=open('test.txt','r')
except FileNotFoundError:
    pass
else : 
    print("에러 없이 잘 처리 되었습니다.")