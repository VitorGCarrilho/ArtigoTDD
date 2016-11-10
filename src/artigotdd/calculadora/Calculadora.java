package artigotdd.calculadora;

public class Calculadora {
	
	public int somar(int ... input){
		int soma = 0;
		for(int a : input){
			soma += a;
		}
		return soma;
	}
	
	public int subtrair(int ... input){
		int subtracao = input[0];
		for(int i = 1; i<input.length; i++){
			subtracao -= input[i];
		}
		return subtracao;
	}

	public int dividir(int valorA, int valorB) {
		
		return valorA/valorB;
	}

}
