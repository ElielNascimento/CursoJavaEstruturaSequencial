package curso_programacaoEx1;

import java.util.Scanner;

public class Exerc5Java {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codPeca;
		int codPeca2;
		int numPeca;
		int numPeca2;
		double valorUnit; 
		double valorUnit2;
		double soma;
		
		codPeca = sc.nextInt();
		numPeca = sc.nextInt();
		valorUnit = sc.nextDouble();

		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();

		soma = numPeca * valorUnit + numPeca2 * valorUnit2;
	
		System.out.printf("%.2f", soma);
		sc.close();

	}

}
