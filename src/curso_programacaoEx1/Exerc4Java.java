package curso_programacaoEx1;

import java.util.Scanner;

public class Exerc4Java {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numFunc;
		double horasTrab;
		double salaFunc;
		double valorHora;
       
		numFunc = sc.nextInt();
		horasTrab = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		salaFunc = horasTrab * valorHora;
		
		System.out.printf( "Number = " + numFunc + " \nSalario  = U$ %.2f ",salaFunc);

		sc.close();
	}

}
