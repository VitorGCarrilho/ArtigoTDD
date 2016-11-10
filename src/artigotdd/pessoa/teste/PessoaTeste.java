package artigotdd.pessoa.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import artigotdd.pessoa.Pessoa;
import artigotdd.pessoa.PessoaController;

public class PessoaTeste {
	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida()
            throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alexandre");

		LogMock nossoLogMock = new LogMock();
		PessoaController pessoaController = new PessoaController(nossoLogMock);
		pessoaController.exclui(pessoa);

		assertEquals(pessoa.getNome(), nossoLogMock.getNome());
	}
}
