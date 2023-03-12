package Tpractico1;
// Utilizando la sentencia while, imprima todos los núm entre 2 variables “a”y “b
// con una variable extra, elija si se deben mostrar los números pares o impares

public class Tpractico1ejec1c {
	
public static void main(String []args) {
	
	int numInicio=4;
	int numFin=15;
	boolean  par=true;
	
	while(numInicio<=numFin) {
		
		if (numInicio%2 ==0 &&  par) {
			System.out.print(numInicio+",");
			} 
		numInicio++;
		if (numInicio%2 != 0 && !par) {
			System.out.print(numInicio+",");
		}
	}
	
System.out.println("  ");
System.out.println("resolucion con switch case  ");

//otra manera de resolvero con switch case
numInicio =5;
numFin = 14;


char imprimir = 'i';   //p -> un número par ; i -> impares    nosotros elegimos p o i en este caso se eleigio i

while(numInicio <= numFin) {
	
	switch(imprimir) {
		case 'p':
			if(numInicio % 2 == 0) {
				System.out.println(numInicio);
			}
			break;
		case 'i':
			if(numInicio % 2 != 0) {
				System.out.println(numInicio);
			}
			break;
		default:
			System.out.println("Opcion incorrecta");
		
		}
		numInicio++;
	}
}
}