package curso_programacaoEx1;

import java.util.Scanner;

public class Exerc2Java {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double area, raio;
		
	 raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		
		System.out.printf("%.4f" , area);
		sc.close();
	}

}
