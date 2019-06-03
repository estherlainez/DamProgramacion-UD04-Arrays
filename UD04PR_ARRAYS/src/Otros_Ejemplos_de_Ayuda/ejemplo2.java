package Otros_Ejemplos_de_Ayuda;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int[] nEntidad=new int[4];
		int[] nSucursal=new int[4];
		int[] nCuenta=new int[10];
		int control1=0;
		int control2=0;
		System.out.println("Introduce el numero de la entidad(4 digitos): ");
		for(int i=0;i<4;i++) {
			nEntidad[i]= teclado.nextInt();
		} 
		System.out.println("Introduce el numero de la sucursal(4 digitos): ");
		for(int i=0;i<4;i++) {
			nSucursal[i]= teclado.nextInt();
		}
		System.out.println("Introduce el numero de la cuenta(10 digitos): ");
		for(int i=0;i<10;i++) {
			nCuenta[i]= teclado.nextInt();
		}
		//Primer digito de control
		nEntidad[0]=nEntidad[0]*4;
		nEntidad[1]=nEntidad[1]*8;
		nEntidad[2]=nEntidad[2]*5;
		nEntidad[3]=nEntidad[3]*10;
		nSucursal[0]=nSucursal[0]*9;
		nSucursal[1]=nSucursal[1]*7;
		nSucursal[2]=nSucursal[2]*3;
		nSucursal[3]=nSucursal[3]*6;
		for(int i=0;i<4;i++) {
			control1=control1+nEntidad[i]+nSucursal[i];
		}
		control1=control1%11;
		control1=11-control1;
		if (control1==10){
			control1=1;
		}
		System.out.println("El primer digito de control es: "+control1);
		//Segundo digito de control
		nCuenta[0]=nCuenta[0]*1;
		nCuenta[1]=nCuenta[1]*2;
		nCuenta[2]=nCuenta[2]*4;
		nCuenta[3]=nCuenta[3]*8;
		nCuenta[4]=nCuenta[4]*5;
		nCuenta[5]=nCuenta[5]*10;
		nCuenta[6]=nCuenta[6]*9;
		nCuenta[7]=nCuenta[7]*7;
		nCuenta[8]=nCuenta[8]*3;
		nCuenta[9]=nCuenta[9]*6;
		for(int i=0;i<10;i++) {
			control2=control2+nCuenta[i];
		}
		control2=control2%11;
		control2=11-control2;
		if (control2==10){
			control2=1;
		}
		System.out.println("El segundo digito de control es: "+control2);	
		teclado.close();
	}
}
