package Ejercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Ej04_bidimensionales_ej3medianteFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		//int v[][]=new int [6][10];
		int mayor,menor,fila=0,columna=0,i=0,j=0;
		int columnaMayor=j,filaMayor=i;
		int filaMenor=i,columnaMenor=j;
		//crear y mostrar array
		int v[][]=new int [6][10];
		for( fila=0;fila<6;fila++) {
			
			for( columna=0;columna<10;columna++) {
				v[fila][columna]=(int)(Math.random()*100+1);
				System.out.print(v[fila][columna]+"\t");
			}
			System.out.print("\n");
		}		
		
		mayor=maximoValor(v);
		menor=minimoValor(v);
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		//System.out.println("El mayor es "+mayor+" y esta en la fila "+ filaMayor+" y en la columna "+columnaMayor);
		//System.out.println("El menor es "+ menor+" y esta en la fila "+filaMenor+" y esta en la columna "+columnaMenor);
		
		
	}

	public static int maximoValor(int v[][]) {
		int mayor=0;
		int filaMayor=0;
		int columnaMayor=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				if(mayor<v[i][j]) {
					mayor=v[i][j];
					i=filaMayor;
					j=columnaMayor;
				}
			}
		}
		return mayor;
	}
	
	
	public static int minimoValor(int v[][]) {
		int menor=100;
		int columnaMenor=0; 
		int filaMenor=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				if (menor>v[i][j]) {
				menor=v[i][j];
					i=filaMenor;
					j=columnaMenor;
				}
			}
		}
		return menor;
		
		
	}
	
}