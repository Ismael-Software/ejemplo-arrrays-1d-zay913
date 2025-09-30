v = []  
n = int(input("¿Cuántos números deseas ingresar?: "))
for i in range(n):
    v2 = int(input(f"Ingresa el número {i+1}: "))
    v.append(v2)
pos = 0
ac = 0
while pos < len(v):
    ac = ac + v[pos]
    pos = pos + 1
print("La suma es:", ac)
mayor = v[0]  
pos = 1
while pos < len(v):
    if v[pos] > mayor:
        mayor = v[pos]
    pos = pos + 1

print("El número mayor es:", mayor)
