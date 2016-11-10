package artigotdd.pessoa.teste;

import artigotdd.pessoa.GeradorDeLog;

public class LogMock implements GeradorDeLog {

	private String nome;

	@Override
	public void criaLog(String nomeDaPessoa) {
		this.nome = nomeDaPessoa;
	}

	public String getNome() {
		return nome;
	}
}