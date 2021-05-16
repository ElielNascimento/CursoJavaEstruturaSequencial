package curso_programacaoEx1;

import java.util.Scanner;

public class Exerc1Java {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X, Y, soma;

		X = sc.nextInt();
		Y = sc.nextInt();

		soma = X + Y;

		System.out.printf("O Resultado da soma de: " + X + " + " + Y + "\n" + "= " + soma);
		sc.close();

	}

}
