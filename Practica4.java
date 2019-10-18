import java.util.Scanner;
public class Practica4 {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		double nota = input.nextDouble();

		if (nota > 10) {

			System.out.print("Incorrecto\n");

		} else if (nota >= 9 && nota <= 10) {

			System.out.print("Excelente\n");

		} else if (nota >= 6.5 && nota < 9) {

			System.out.print("Notable\n");

		} else if (nota >= 5 && nota < 6.5) {

			System.out.print("Aprobado\n");

		} else if (nota >= 0 && nota < 5) {

			System.out.print("Suspendido\n");

		} else {

			System.out.print("Incorrecto\n");
			

		}
	}
}