def selectionsort(a):
    for i in range (0,n):
        min=i
        for j in range (i+1,n):
            if a[j]<a[min]:
                min=j
        a[i],a[min]= a[min],a[i]
    return a
n=int(input("Enter no. of elements "))
a=[]
for i in range (0,n):
    a.append(int(input("Enter element ")))
print(selectionsort(a))