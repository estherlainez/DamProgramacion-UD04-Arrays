package Ejercicios;

import java.util.Arrays;

public class Ej03_bidimensionales_numerosAleatorios_Maximo_y_Minimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mayor=0,menor=100;
		int fila;
		int columna;
		int minimo;
		int columnaMinimo=0,filaMinimo=0;
		int maximo;
		int columnaMaximo=0,filaMaximo=0;
		
		//crear y mostrar array
		int v[][]=new int [6][10];
		for( fila=0;fila<6;fila++) {
			
			for( columna=0;columna<10;columna++) {
				v[fila][columna]=(int)(Math.random()*100+1);
				System.out.print(v[fila][columna]+"\t");
			}
			System.out.print("\n");
		}	
		
		//buscar valores y sus coordenadas
		
		for(fila=0;fila<6;fila++) {
			for( columna=0;columna<10;columna++) {
				
				if(menor>v[fila][columna]) {
					menor=v[fila][columna];
					filaMinimo=fila;
					columnaMinimo=columna;
				}
			}
		}
			System.out.println(" ");
			
		for(fila=0;fila<6;fila++) {
			for(columna=0;columna<10;columna++) {

				if(mayor<v[fila][columna]) {
					mayor=v[fila][columna];
					filaMaximo=fila;
					columnaMaximo=columna;
				}
					
			}
		}
			
		
		System.out.println("El mayor es "+mayor+" y esta en la fila "+ filaMaximo+" y en la columna "+columnaMaximo);
		System.out.println("El menor es "+ menor+" y esta en la fila "+filaMinimo+" y en la columna "+columnaMinimo);
		
	}

}