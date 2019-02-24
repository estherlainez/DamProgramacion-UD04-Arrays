package Ejemplos;

import java.util.Arrays;

public class Ej_01_declaracionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Se puede declarar de las dos formas
		int n01 [];
		int [] n02;
		//2)Ejemplo reserva de memoria de arrays
		
		n01=new int [5];
		//tambien podemos usar la variable entera para dar el valor
		int numElementos=5;
		n02=new int [numElementos];
		//las dos tareas anteriores en 1
		int notas[]=new int[5];
		String alumnos[]=new String [5];
		double altura[]=new double[5];
		
		//3)Ejemplo de dar valores a un array
		notas[0]=1;
		notas[1]=2;
		notas[2]=3;
		notas[3]=4;
		notas[4]=5;
		
		//4)Otrta forma de crear un array, reservar el espacio y dar valores
		int n03[]= {2,3,4,5,6,7,8,9};
		String diasSemana2[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		diasSemana2[0]="Lunes";
		diasSemana2[1]="Martes";
		diasSemana2[2]="Miercoles";
		diasSemana2[3]="Jueves";
		diasSemana2[4]="Viernes";
		diasSemana2[5]="Sabado";
		diasSemana2[6]="Domingo";
		
		//dar contenido a un arrary mediante un for
		for(int i=0;i<notas.length;i++) {
			notas[i]=3;
		}
		
		//5)Mostrar el contenido de un array
		//Tenemos que poner el nombre del array y la posicion
		//del dato que queremos mostrar
		
		System.out.println(notas[0]);
		/*si ponemos solo el nombre del array se nos muestra
		 * la direccion de la referncia en memoria
		 * 
		 */
		System.out.println(notas);
		
		//si quiero mostrar todo el contenido de un array
		for(int i=0;i<=4;i++) {
			System.out.println("El valor del array en la"
					+ " posicion"+ i+ " es: "+ notas[i]);
			
		}
		
		//Podemos usar una funcion de java para averiguar el tamaño
		//de un array en caso de que no lo sepamos de antemano,
		//por ejemplo,en el caso en el que se lee por teclado
		//el tamaño del array. Aunque esta funcion
		//se puede usar siempre
		
		for(int j=0;j<diasSemana2.length;j++) {
			
			System.out.println("El valor del array en"+" la posicion" +j+
					"es:"+diasSemana2[j]);
		}
		//hay un tipo de dato que se utiliza para las colecciones de datos como puede
		//ser un array que funciona como el for y su sintaxis es la siguiente:
		
		//for(tipoDatoDelArray identificador:array){
		//usamos identificador como variable escalar
		//}
		
		for(int d: notas) {
			System.out.println(d);
		}
		
		for(String s: diasSemana2) {
			System.out.println(s);
		}
		//7)Mostrar un array mediante el metodo toString, de la clase arrays
		
		String cadena=Arrays.toString(diasSemana2);
		System.out.println(cadena);
		
		//8)Como inicializar un array mediante el metodo fill
		cadena=Arrays.toString(notas);
		System.out.println(cadena);
		
		Arrays.fill(notas, -3);
		//Pone a todos los valores notas -3
		cadena=Arrays.toString(notas);
		System.out.println(cadena);
		
		Arrays.fill(notas, 0,2,-5);
		System.out.println(Arrays.toString(notas));
		//De la posicion 0 a la posicion 2, sin llegar a la 2, le pone -5
		//En el resto te deja lo que tienes
		
		
		//9)Como calcular numeros random
		for(int i=0;i<10;i++) {
			System.out.println((int) (Math.random()*11)+"  ");
			//v[i]=(Math.random);
		}
		
		//10)Comparar 2 arrays
		//Dos arrays son iguales, si contienen el mismo numero de elmentos
		//y en el mismo orden
		
		int n1[]= {1,2,3,4};
		int n2[]= {1,2,3,4};
		
		/*if (n1==n2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}//No funciona*/
		
		boolean g=Arrays.equals(n1, n2);
		if (g==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		//11)Como buscar en un array un elemento determinado
		
		int n[]= {1,2,3,4,5,6,7,8,9,10};
		int aBuscar=3;
		int i=0;
		while(i<n.length&&n[i]!=aBuscar) {
			i++;
		}
		if(i<n.length) {
		System.out.println("El elemento se encuentra en la posicion"+i);
		}else {
			System.out.println("Nos hemos salido de rango");
		}
		
		//12)Como buscar en un array con los metodos de la clase array
		
		//Podemos usar la funcion BinarySearch(array[]),elemento aBuscar
		//para buscar un elemento en un  array. La condicion que pone dicho metodo
		//es que el array este ordenado, pero podemos ordenar el array
		//con otro metodo de la clase arrays, Arrays.sort();
		//Asi combinando ambos metodos, podemos hacer una busqueda mas rapidamente
		//que si tenemos que hacer nosotros el algoritmo de busqueda.
		//Esto es otra opcion que sera tomada en cuenta si se adapta a nuestras necesidades
		
		int t[]= {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(t);
		Arrays.toString(t);
		int posicion=Arrays.binarySearch(t, 3);
		System.out.println("El numero esta en la posicion"+posicion);
		
		
		
		
	}

}
