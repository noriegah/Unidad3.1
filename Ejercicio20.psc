Algoritmo capicua
	Escribir "Ingrese un numero"
	leer num
	Si num<=99999
		decenemillar=Subcadena(num,4,1)*10000
		unidadmillar=Subcadena(num,3,1)*1000
		centena=Subcadena(num,2,1)*100
		decena=Subcadena(num,1,1)*10
		unidad=Subcadena(num,0,1)*1
		suma=decenemillar+unidadmillar+centena+decena+unidad
		Si suma=num
			Escribir "Es Capicua"
		SiNo
			Escribir "No es Capicua"
		FinSi
	FinSi
FinAlgoritmo
