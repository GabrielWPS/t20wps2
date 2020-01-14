package org.itstep.aluguel.facade;

import java.sql.SQLException;
import java.util.Date;

import org.itstep.aluguel.model.Cliente;
import org.itstep.aluguel.model.DocumentoPessoaFisica;
import org.itstep.aluguel.model.Endereco;
import org.itstep.aluguel.model.PessoaFisica;
import org.itstep.aluguel.model.Telefone;

import org.itstep.aluguel.dao.jdbcDAOFactory;

public class ClienteFacade {

	public Cliente buscaCliente(Integer codigo) throws SQLException {
		jdbcDAOFactory jdbc = new jdbcDAOFactory();
		
		// Busca Bancos de Dados
		// Aula do dia '11'
		// Mocar dados
		String tipoPessoa = "PF";

		Cliente cliente = new Cliente();

		if ("PF".equals(tipoPessoa)) {

			DocumentoPessoaFisica documentosPessoaFisica = new DocumentoPessoaFisica();
			documentosPessoaFisica.setCpf("1111111111");
			documentosPessoaFisica.setDtEmissaoRG(new Date());
			documentosPessoaFisica.setHabilitacao("222222222");
			documentosPessoaFisica.setOrgaoEmissor("Detran");
			documentosPessoaFisica.setRg("123456");

			Endereco endereco = new Endereco();

			endereco.setBairro("Barra");
			endereco.setCep("22222222");
			endereco.setCidade("Rio de Janeiro");
			endereco.setComplemento("loja A 3º andar");
			endereco.setLogradouro("Avenidas das Americas");
			endereco.setNumero("3555");
			endereco.setUf("RJ");

			Telefone telefone = new Telefone();

			telefone.setDdd(21);
			telefone.setDdi(55);
			telefone.setNumero(91970620);
			telefone.setTipoTel("Celular");
			telefone.setRamal("");
			telefone.setTipoRC("R");
			
			
			PessoaFisica pessoaFisica = new PessoaFisica();
			pessoaFisica.setCodigo(codigo);
			pessoaFisica.setDocumentoPessoaFisica(documentosPessoaFisica);
			pessoaFisica.setDtNascimento(new Date());
			pessoaFisica.setEmail("moreyra.fe@gmail.com");
			pessoaFisica.setEndereco(endereco);
			pessoaFisica.setNome("Felipe");
			pessoaFisica.setSexo("M");
			pessoaFisica.setTelefone(telefone);
			
			
			cliente.setPessoaFisica(pessoaFisica);

		} else {

		}
		
		return cliente;

	}

}
