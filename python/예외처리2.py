def checkInt(x: int) :
    if not type(x) is int:
        raise TypeError("정수가 아닙니다")
    return True 

try:
    checkInt("asdfasdf")
except TypeError as el:
    print(el)

    
## 사용자로부터 점심 메뉴를 입력받아 금액을 출력해줌 .
menu_price = [0,10000,20000,30000]
total = 0
try:
    menu = 0
    while menu < 4:
        menu = int(input('''
        점심에 먹고싶은 메뉴?
        1. 라면 ( 10000 원 )
        2. 밥   ( 20000 원)
        3. 커피 ( 30000 원)
        4. 끝 
                '''))
        try:
            total += menu_price[menu]
            print("\t 총합 : " ,total,"원")
            
        except IndexError as el:
            pass
    else: 
            print("\t 총합 : " ,total,"원")
        
except ValueError as el:
    print("입력을 다시해주세요")
    print(el)