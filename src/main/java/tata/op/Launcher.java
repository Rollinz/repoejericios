package tata.op;

import tata.op.basicas.Operaciones;

public class Launcher {
	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		
		System.out.println("La suma entre 10 y 5 es: " + op.sumar(10, 5));
		System.out.println("La suma entre 10 y 0 es: " + op.sumar(10, 0));
	}
}
