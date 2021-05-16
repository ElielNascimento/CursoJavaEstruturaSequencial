package curso_programacaoEx1;

import java.util.Scanner;

public class Exerc6Java {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double areaTriang;
		double pi = 3.14159;
		double areaTrap;
		double quadrado;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		areaTriang = A * C / 2;

		areaTrap = (A + B) * C / 2;
		
		quadrado = B * B;

		System.out.printf("TRIANGULO: %.3f", areaTriang);
		System.out.printf("\nTRAPEZIO: %.3f", areaTrap);
		System.out.printf("\nQuadrado: %.3f", quadrado);

		sc.close();

	}

}
