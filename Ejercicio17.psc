Algoritmo triangulo
	Escribir "Ingrese primer lado"
	Leer lado1
	Escribir "Ingrese segundo lado"
	Leer lado2
	Escribir "ingrese tercer lado"
	Leer lado3
	Si lado1=lado2 lado2=lado3
		Escribir "Es un triángulo Equilatero"
	SiNo
		Si lado1<>lado2 lado2<>lado3
			Escribir "Es un triángulo Escaleno"
		SiNo
			Escribir "Es un triángulo Isosceles"
		FinSi
	FinSi
FinAlgoritmo
