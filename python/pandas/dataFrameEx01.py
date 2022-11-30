import pandas as pd;

sales =[[1,2,3,4],[5,6,7,8]]
labels = ['a','b,','c','d']
df = pd.DataFrame.from_records(sales,columns=labels)
print(df)

sales ={ 'acount' : [1,2,3,4],
        'asdf' : [1,2,3,4],
        'bidk' : [1,2,3,4]}
df = pd.DataFrame.from_dict(sales)
print(df)
df.rename(columns={'acount':'one', 'asdf':'two', 'bidk':'three'},inplace=True)
df.rename(index={0:5,1:6,2:7,3:8},inplace=True)
print(df)

# sales ={ ('acount',[1,2,3,4]),
#         ('asdf' , [1,2,3,4]),
#         ('bidk' , [1,2,3,4])}
# df = pd.DataFrame.from_items(sales)
# print(df)


# 수정
sales ={ 'acount' : [1,2,3,4],
        'asdf' : [1,2,3,4],
        'bidk' : [1,2,3,4]}
df = pd.DataFrame.from_dict(sales)
print(df)
df.rename(columns={'acount':'one', 'asdf':'two', 'bidk':'three'},inplace=True)
df.rename(index={0:5,1:6,2:7,3:8},inplace=True)
print(df)

# 삭제 axis = 0 수평 1 수직 
print(df.drop(index=5))
print(df.drop('two', axis=1))
print(df.drop(8)) # default index ... ok|ok
print(df.drop(columns='one'))
l = df.loc['one']
print(l)