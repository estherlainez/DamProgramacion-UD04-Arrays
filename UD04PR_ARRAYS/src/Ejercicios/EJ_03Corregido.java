package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;
public class EJ_03Corregido {
   public static void main(String[] args) {

      // TODO Apéndice de método generado automáticamente
       int opcion=0, ceros=0;
       double mediana, media;
       Scanner teclado=new Scanner(System.in);

       System.out.println("Introduzca el numero de elementos: ");
       int numElementos=teclado.nextInt();
       int numeros[]=new int [numElementos];

       for(int i=0;i<numElementos;i++) {
            System.out.println("Introduzca el valor de la posicion "+i+": ");
             numeros[i]=teclado.nextInt();
        }

        do {
        	System.out.println("\t MENU");
        	System.out.println("1. Calcular la media de los números"); 
        	System.out.println("2. Calcular la mediana de los números");
        	System.out.println("3. Contar el número de ceros");
        	System.out.println("4. Imprimir Array");
        	System.out.println("5. Salir");
        	System.out.println("Introduzca la opción que quiera ejecutar:");
        	opcion=teclado.nextInt();

        	switch (opcion) {
                  case 1:{
                  media=CalcularMedia(numeros);
                  System.out.println("La media es: "+media);
                  break;
                  }

                  case 2:{
                  mediana=CalcularMediana(numeros);
                  System.out.println("La mediana es: "+mediana);
                  break;
                  }

                  case 3:{
                  ceros=ContarCeros(numeros);
                  System.out.println("El numero de ceros es: "+ceros);
                  break;
                  }

                  case 4: {
                  System.out.println(Arrays.toString(numeros));
                  }

                  case 5:{
                  System.out.println("Salir");
                  break;
                  }

                  default:{
                	  System.out.println("Ha introducido una opcion errónea");
                  }

                  }
            }while (opcion!=5);
        }
          
          
     public static double CalcularMedia (int [] v) {
        int suma=0;
        double media=0;
        for (int a:v) {
         suma=suma+a;
        }
        media =suma/v.length;
        return media;
      }

     public static double CalcularMediana (int [] v) {
        int pos;
        double mediana;
        Arrays.sort(v);
        pos=v.length/2;
        if (v.length%2==0) {
          mediana=((double) v[pos-1]+(double) v[pos])/2;
        }else {
               mediana=v[pos];
               }
        return mediana;
     }

   public static int ContarCeros (int []v) {
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

}