package Calculo;


/**
 * @author fsdney
 */

public class Calculadora {
	
	private int adicionar(int a, int b) {
		return a + b;
		
	}

	private int subtrair(int a, int b) {
		return a -b;
	}
	
	private int multiplicar(int a, int b) {
		return a * b;
	}
	
	private int dividir(int a, int b) {
		if(b == 0) {
			throw new IllegalArgumentException("Divisão por zero não é permitida.");
		}
		return a / b;
	}
}
