package artigotdd.calculadora.teste;

import org.junit.Test;

import artigotdd.calculadora.Calculadora;

import static org.junit.Assert.*;

public class CalculadoraTeste {
	
	@Test
	public void deveriaSomaDoisValores() throws Exception{
		int valorA = 1;
		int valorB = 2;
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(valorA, valorB);

		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSomarCincoValores() throws Exception {
		int valor = 1;
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(valor, valor, valor, valor, valor);
		
		assertEquals(5, soma);
		
	}
	
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
		Calculadora calculadora = new Calculadora();
		int valorA = 1;
		int valorB = 2;
		int soma = calculadora.subtrair(valorA, valorB);

		assertEquals(-1, soma);
	}
	
	
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.dividir(valorA, valorB);

		assertEquals(3, divisao);
	}

	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
             throws Exception {
		int valorA = 6;
		int valorB = 0;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.dividir(valorA, valorB);
	}
}
