package Ejercicios;
import java.util. Scanner;
public class Ejer_02_mostrarArrayOrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		System.out.println( "cantidad de numeros");
		int n=teclado.nextInt();
		int numeros[]= new int[n];
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=teclado.nextInt();
			System.out.println(numeros[i]);
		}
		
		System.out.println("orden inverso");
	    for (int i = numeros.length - 1; i >= 0 ; i--) {
	          System.out.println( "numero "+numeros[i]);
	    }
	}
}
