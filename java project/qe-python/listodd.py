a=0
l1=list[4,7,9,6]
l2=list[6,0,7,2]
l3=[]
for i in l1:
     if(a%2!=0):
        l3.append(i)
for i in l2:
    if(a%2==0):
     l3.append(i)
print(l3)
