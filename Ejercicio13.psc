Algoritmo volumen_cilindro
	Escribir "Ingrese el radio del cilindro"
	Leer radio
	Escribir "Ingrese la altura del cilindro"
	Leer altura
	Si radio>0 y altura>0
		volumen=pi*radio*radio*altura
		Escribir "El volumen del Cilindro es " volumen
	SiNo
		Escribir "El radio o la altura ingresada no puede ser un número negativo"
	FinSi
FinAlgoritmo
