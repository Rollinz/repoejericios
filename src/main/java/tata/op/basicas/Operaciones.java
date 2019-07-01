package tata.op.basicas;

public class Operaciones {
	public int sumar(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		return a + b;
	}
	
	public int restar(int a, int b) {
		if (b > a) {
			return 0;
		}
		return a - b;
	}
	
	public int multiplicacion(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * b;
	}
	
	public double dividir(int a, int b) {
		if (b == 0) {
			return 0d;
		}
		return (double)a / b;
	}
}
