# mypkg패키지안에서 operation 모듈 가져오기
# from mypkg import operation
# from mypkg import geometry
''' 변화를 주고싶음 
중요 __init__ 파일을 만들어줘야함 .
# from mypkg import * # error
# import mypkg.* # error
'''
from mypkg import * 

print(operation.add(100,7))

print(geometry.rectangle_area(3,4))
print(geometry.triangle_area(3,4))