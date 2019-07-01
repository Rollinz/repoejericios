package tata.test.op.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.op.basicas.Operaciones;

public class OperacionesTest {
	private Operaciones op;
	@Before
	public void setUp() throws Exception {
		this.op = new Operaciones();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminamos con las pruebas");
	}

	@Test
	public void test() {
		int resultado = this.op.sumar(10, 10);
		assertEquals(20, resultado);
		
		int resultado2 = this.op.sumar(0, 10);
		assertEquals(0, resultado2);
		
		int resultado3 = this.op.restar(10, 5);
		assertEquals(5, resultado3);
		
		int resultado4 = this.op.restar(5, 10);
		assertEquals(0, resultado4);
		
		int resultado5 = this.op.multiplicacion(10, 10);
		assertEquals(100, resultado5);
		
		int resultado6 = this.op.multiplicacion(10, 0);
		assertEquals(1, resultado6);
		
		double resultado7 = this.op.dividir(10, 5);
		assertTrue(resultado7 == 2);
		
		double resultado8 = this.op.dividir(5, 0);
		assertTrue(resultado8 == 0);
	}

}
