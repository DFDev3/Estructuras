def REGRESION(x=list,y=list):
        xy=[]
        x2=[]
        sum_x=sum(x)
        sum_y=sum(y)
        prom_x=(sum_x/len(x))
        prom_y=(sum_y/len(y))
        for i in range(len(x)):
            xy.append(x[i]*y[i])
        sum_xy=sum(xy)
        for i in range(len(x)):
            x2.append(x[i]*x[i])
        sum_x2=sum(x2)
        m=((len(x)*(sum_xy))-(sum_x*sum_y)/((len(x)*sum_x2)-(sum_x*sum_x)))
        b=float(prom_y-(m)*(prom_x))
        print(f"\n\nLa ecuación de la recta de la regresión lineal es y = {m}x+({b})\n\n")
        return [m,b]
from math import sqrt
import os
import numpy as np
isActive=True
headers=["MÍNIMOS CUADRADOS","MODELO EXPONENCIAL","ECUACIONES DE POTENCIA/RAZONES DE CRECIMIENTO","DESVIACION/ERROR/COEFICIENTE","SALIR"]
while isActive:
    os.system('pause')
    # os.system('cls')
    print("\n\n             REGRESIONES\n\n\n")
    for i in range(len(headers)):
        print(f"{i+1} - {headers[i]}")
    op=int(input("_"))
    if op==1:
        x=[1,2,3,4,5,6,7,8]
        y=[7,5,6,3,4,2.6,2,0.6]
        REGRESION(x,y)
    elif op==2:
        x = np.array([1,2,3,4,5,6])
        y = np.array([4.5,6,9,12,17,24])
        log_x = np.log(x)
        log_y = np.log(y)
        coefficients = np.polyfit(x, log_y, 1)
        print(f"\n\nLa ecuación de la curva de la regresión por modelo exponencial es y = {coefficients[0]}x+({coefficients[1]})\n\n")
    elif op==3:
        pass
    elif op==4:
        x=[1,2,3,4,5,6,7]
        y=[0.2,0.6,1.6,3.5,5.5,9.1,13]
        xy=[]
        x2=[]
        y_y2=[]
        sr=[]
        sum_x=sum(x)
        sum_y=sum(y)
        prom_x=(sum_x/len(x))
        prom_y=(sum_y/len(y))
        for i in range(len(x)):
            xy.append(x[i]*y[i])
        sum_xy=sum(xy)
        for i in range(len(x)):
            x2.append(x[i]*x[i])
        sum_x2=sum(x2)
        m=((len(x)*(sum_xy))-(sum_x*sum_y)/((len(x)*sum_x2)-(sum_x*sum_x)))
        b=prom_y-(m)*(prom_x)
        for i in range(len(y)):
            y_y2.append((y[i]-prom_y)**2)
        St=sum(y_y2)
        Sy=sqrt((St)/(len(x)-1))
        for i in range(len(x)):
            sr.append((y[i]-b-m*(x[i]))**2)
        Sr=sum(sr)
        sy_x=sqrt((Sr)/(len(x)-2))
        print(f"{St} - {Sr}")
        r=sqrt((St-Sr)/(St))*100
        print(f"\n\nLa ecuación de la recta de la regresión lineal es y = {m}x+({b})\n\n")
        print(f"La desviación estándar es {Sy}, el error estándar de la estimación es {sy_x}, y el coeficiente de correlación es {r}")
    elif op==5:
        isActive=False
