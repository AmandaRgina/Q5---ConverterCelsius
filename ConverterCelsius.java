package converterCelsius;

import java.util.Scanner;

public class ConverterCelsius {

	public static void main(String[] args) {
	
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		
		Scanner input = new Scanner(System.in);
		
		double F = input.nextDouble();
		
		double C =  5 * ((F-32) / 9);
		
		System.out.println("A temperatura em Celsius é: " + C);
		
		input.close();

	}

}
