package Ejercicios;
import java.util.Scanner;
public class Ejer_01_introducirNumerosyMostrarEnOrden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar el array
		double n[]=new double[5];
		
		//introducir numeros por teclado
		Scanner teclado= new Scanner (System.in);
		for(int i=0; i<n.length;i++) {
			n[i]=teclado.nextDouble();
		}
		
		//mostrar
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		
		
		for(double m:n) {
			System.out.println(m);
		}
		
		for (int i=0;i<5;i++) {
			System.out.println(n[i]);
		}

	}

}
