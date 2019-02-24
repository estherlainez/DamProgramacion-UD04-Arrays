package Ejercicios;
import java.util. Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ejer_03_menu_media_mediana_ceros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Inroduzca numero de elementos");
		int ceros=0,opcion=0;
		double mediana,media;
		int numElementos=teclado.nextInt();
		int numeros[]= new int[numElementos];
		
		for(int i=0;i<numElementos;i++) {
			System.out.println("Introduzca el valor de la posicion"+i+":");
		     //numeros[i]=teclado.nextInt();
			numeros[i]=((int) (Math.random()*11));
			System.out.println("numero de la posicion"+numeros[i]);
		}
		
		
		do {			
			System.out.println("\t MENU");
			System.out.println("1.Calcular la media");
			System.out.println("2.Calcular la mediana");
			System.out.println("3.Calcular el numero de ceros");
			System.out.println("4.Imprimir Array");
			System.out.println("5.Buscar un valor");
			System.out.println("6.Buscar valor con el array ordenado");
			System.out.println("7.Salir");
			System.out.println("Introduzca opcion");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:{
				media=CalcularMedia(numeros);
				System.out.println("calcular la media es"+media);
				break;
			}
			case 2:{
				mediana=CalcularMediana(numeros);
				System.out.println("calcular la mediana es"+mediana);
				break;
			}
			case 3:{
				ceros=ContarCeros(numeros);
				System.out.println("el numero de ceros es "+ceros);
				break;
			} 
			case 4:{
				System.out.println(Arrays.toString(numeros));
				break;
			}
			
			case 5:{
				System.out.println("Introduce valor a buscar");
				int aBuscar=teclado.nextInt();
				int pos=BuscarValor(numeros,aBuscar);
				if(pos==1) {
				System.out.println("No hemos encontrado dicho valor");
				}else {
					System.out.println("El valor a buscar "+aBuscar+" esta en la posicion "+pos);
				}
				break;				
			}
			
			case 6:{
				System.out.println("Introduzca valor a buscar");
				int aBuscar=teclado.nextInt();
				int pos=BusacrValorArrayOrdenado(numeros,aBuscar);
				
				System.out.println("Ahora podemos hacer algo en el elemento"+ " "+ aBuscar+" porque sabemos que esta en la posicion"+pos);
				System.out.println(Arrays.toString(numeros));
				break;
			}
			
			case 7:{
				System.out.println("Salir");
				break;
			}
			default:{
				System.out.println("Ha introducido una opcion erronea");
				}
			}
		}while(opcion!=7);
	
	}
		
	
	public static double CalcularMedia(int[] v) {
		int suma=0;
		double media=0;
		for(int a:v) {
			suma=suma+a;
			media=suma/v.length;
		}
		
		return media;
	}	
	
	public static double CalcularMediana(int[] v) {
		int pos;
		double mediana;
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		if (v.length%2==0) {
			pos=v.length/2;
			mediana=((double)v[pos-1]+(double)v[pos])/2;
		}else {
			pos=v.length/2;
			mediana=v[pos];
		}
		return mediana;
	}
	
	
	public static int ContarCeros(int[]v){
		int numCeros;
		Arrays.sort(v);
		int i=0;
		int contador=0;
		
			while(v[i]==0) {
				contador++;
				i++;
			}
			return contador;
		}
		
		
	public static int BuscarValor(int[]v,int aBuscar) {
		int i=0;
		while(i<v.length&&v[i]!=aBuscar) {
			i++;
		}
		if(i<v.length) {
		
		return i;
		}
		return -1;	
	}
	
	public static int BusacrValorArrayOrdenado(int v[],int n) {
		//el array que venga en el primer parametro sera
		//el que use para hacer las distintas ooperaciones
		
		Arrays.sort(v);
		int posicion=Arrays.binarySearch(v, n);
		return posicion;
	}
	
}

