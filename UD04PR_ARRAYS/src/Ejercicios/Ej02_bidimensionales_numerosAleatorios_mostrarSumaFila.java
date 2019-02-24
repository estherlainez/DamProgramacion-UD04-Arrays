package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;
public class Ej02_bidimensionales_numerosAleatorios_mostrarSumaFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[][]=new int [4][5];
		int filas=4,columnas=5;
		int suma=0,sumaC=0,sumaF=0;
		//Crear array
		for(int i=0;i<filas;i++) {	
			for(int j=0;j<columnas;j++) {	
				numeros[i][j]=(int)(Math.random()*1000);
			}
		}
		
		//mostrar el array
		/*for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.print("\n");
		}*/
		
		//sumar las filas
		for(int i=0;i<filas;i++) {	
			for(int j=0;j<columnas;j++) {					
				sumaF=sumaF+numeros[i][j];	
				System.out.print(numeros[i][j]+"\t ");
			}
			System.out.println(sumaF);
			sumaF=0;
		}
		//sumar columnas
		for(int i=0;i<columnas;i++) {	
			for(int j=0;j<filas;j++) {					
				sumaC=sumaC+numeros[j][i];	
				suma=suma+numeros[j][i];
			}
			System.out.print(sumaC+"\t ");
			sumaC=0;
		}
		System.out.println(suma);
		//suma total
		for(int i=0;i<filas;i++) {
			suma=0;
			for(int j=0;j<columnas;j++) {
				suma+=numeros[i][j];
			}
			
		}
		System.out.println("");
		
		
	}
}
