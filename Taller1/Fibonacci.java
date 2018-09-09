import matplotlib.pyplot as plt
from timeit import timeit
from time import time

def fibonacci(n):
    
    if n <= 1:
        return 1
    
    fib = 1
    prevFib = 1
    
    for i in range(2, n):
        temp = fib
        fib += prevFib
        prevFib = temp
    
    return fib
 
    
listaInputs = []
listaOutputs = []
listaTiempo = []
for i in range(1,5000):
    
    tiempo_inic = time()
    fibonacci(i)
    tiempo_fin = time()
    tiempo_ejec = (tiempo_fin - tiempo_inic)*1000000
        
    if tiempo_ejec < 20:
        listaTiempo.append(tiempo_ejec)
        listaOutputs.append(fibonacci(i))
        listaInputs.append(i)
       
    
print (listaInputs) 
print(listaOutputs)
print(listaTiempo)


x = listaInputs
y = listaTiempo

plt.scatter(x, y)


plt.xlabel('MSFT')
plt.ylabel('AAPL')
plt.title('Daily Prices in 2014');

