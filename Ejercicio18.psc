Algoritmo nums
	n1=0
	n2=0
	n3=0
	n4=0
	Escribir "Ingrese un numero de máximo 4 digitos"
	Leer num
	Si num>9999
		Escribir "El número ingresado es mayor a 4 digitos"
	SiNo
		d1=Substr(num,1,1)
		d2=Substr(num,2,1)
		d3=Substr(num,3,1)
		d4=Substr(nume,4,1)
		suma=d1+d2+d3+d4
		Escribir "D1 " d1 "D2 " d2 "D3 " d3 "D4 " d4
		Escribir "La suma de los digitos es " suma
	FinSi
FinAlgoritmo
