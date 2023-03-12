package Tpractico1;

import java.util.Scanner;

public class Tpractico1ejec2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int activos=0;
	     float ingreso  =  489083;
	    float   sueldo=0;
	     int vehiculo  =3;   
	     int  autos=0;
	     int inmuebles =3;
	     int  casas=0;
	   
	     System.out.print("coloque su ingreso mensual :");
	       sueldo= in.nextFloat();
	     System.out.print("vehiculos de menos de 3 años:");
	     autos=in.nextInt();
	     System.out.print ("cantidad de inmuebles:");
	        casas=in.nextInt();
	      System.out.print ("ingrese cantidad de activos de lujo:");
	       activos=in.nextInt();

	if( sueldo>=ingreso || autos >= vehiculo || casas>=inmuebles || activos>0) { 
			
	     System.out.println("persona con ingresos altos");
	} else
	      System.out.println ("personas con ingresos bajos");
	     
	    }
	 



	}


