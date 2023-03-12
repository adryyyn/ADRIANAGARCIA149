package Tpractico1;
//imprima todos los pares invirtiendo el orden entre 2 variables  con ciclo for

public class Tpractico1ejec1d {
public static void main(String[]args) {
	int A=2;
    int B=15;
    
    for (int i=0;  B>=A;   i++) {
    	if (B%2==0) { 
    		System.out.print (B+",");
    		
    	}
    	B--;
    }
}
}
