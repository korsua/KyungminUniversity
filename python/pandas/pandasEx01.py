import pandas as pd;

# dict_data = {'a' : 1, 'b':2, 'c' :3};

# sr = pd.Series(dict_data)

# print(type(sr))
# print('\n')

# print(sr.values)

list_data = ['2021-03-11', 3.14, 'ABC',100, True]
sr = pd.Series(list_data, index=['날짜','파이','알파뱃','숫자','불'])
# sr = pd.Series((4,5,6))
# sr = pd.Series(list({1,2,3}))
print(type(sr.index))
print(type(sr.values))
print(sr['날짜': '숫자'])

## index  [label index , name index]