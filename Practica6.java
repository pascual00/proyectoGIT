//Autor Carlos Vicente Mellinas

import java.util.Scanner;
public class Practica6 {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		int resultado = 0;

		//Primero se le piden al usuarios los dos números enteros
		System.out.print(" Introduce el primer número entero: ");
		int operando1 = input.nextInt();
		System.out.print(" Introduce el segundo número entero: ");
		int operando2 = input.nextInt();

		//Ahora se le da a elegir entre varias opciones
		System.out.print(" Introduce: \n\t[1] para sumar los números \n\t[2] para restar los números \n\t[3] para multiplicar los números \n\t[4] para dividir los números \n\t Introduce un valor: ");
		int eleccion = input.nextInt();

		//Ahora haremos la operación elegida
		switch (eleccion) {
			case 1 :
				resultado = operando1 + operando2;
				System.out.print(" El resultado es " + resultado + "\n");
				break;
			case 2 :
				resultado = operando1 - operando2;
				System.out.print(" El resultado es " + resultado + "\n");
				break;
			case 3 :
				resultado = operando1 * operando2;
				System.out.print(" El resultado es " + resultado + "\n");
				break;
			case 4 :
				resultado = operando1 / operando2;
				System.out.print(" El resultado es " + resultado + "\n");
				break;
			default: 
				System.out.print("Valor incorrecto\n");		
		} 
			
	}
}