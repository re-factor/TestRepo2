def bad_function(a,b):
if a>b:
return True
else: return False

list1=[1,2,3,4]
list2=[3,4,5,6]

for i in list1:
if i in list2:
print(f'{i} found in both lists')
else:
print(f'{i} not found in list2')

def another_bad_function(x,y): if x and y: return x+y else: return 'Error'

print(another_bad_function(3,4))
