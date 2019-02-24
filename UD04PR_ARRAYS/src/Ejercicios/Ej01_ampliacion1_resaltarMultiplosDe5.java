package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;
public class Ej01_ampliacion1_resaltarMultiplosDe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int numeros[]=new int[20];
		int opcion;
		int mul5=0,contador5=0,contador7=0;
		boolean mulCinco=false,mulSiete=false;
		
		for(int i=0;i<20;i++) {
			numeros[i]=(int)(Math.random()*400+1);
			System.out.print(numeros[i]+" ");
		}
		System.out.println(" ");
		
		do {
		System.out.println("¿Que numeros va a resaltar numeros de 5 o de 7?");
		System.out.println("inserte 1 para multiplos de 5 o 2 para multiplos de 7");
		opcion=teclado.nextInt();
		
		switch(opcion) {
			case 1:{
				for(int i=0;i<20;i++) {
					if(numeros[i] %5==0) {
						//mulCinco=true;
						System.out.println("multiplo de 5 es posicion "+i);
						System.out.println(numeros[i]+"["+i+"]");
					}
				}	
				break;
			}

			case 2:{
				
				for(int i=0;i<20;i++) {
					if(numeros[i]%7==0) {
						//mulSiete=true;
						System.out.println("multiplo de 7 es posicion "+i+" con valor "+numeros[i]);
						System.out.println("["+i+"]"+numeros[i]);
					}
			}
				break;
			}
		}
		}while (opcion!=2);
		System.out.println(" ");
			
	} 
	
}
