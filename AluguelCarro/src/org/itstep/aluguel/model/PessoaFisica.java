package org.itstep.aluguel.model;

import java.util.Date;

public class PessoaFisica extends Pessoa {

	// Atributos
	private Date dtNascimento;
	private String sexo;
	private DocumentoPessoaFisica documentoPessoaFisica;

	// Getter and Setter
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public DocumentoPessoaFisica getDocumentoPessoaFisica() {
		return documentoPessoaFisica;
	}

	public void setDocumentoPessoaFisica(DocumentoPessoaFisica documentoPessoaFisica) {
		this.documentoPessoaFisica = documentoPessoaFisica;
	}

	//Metodos a serem implementados
	@Override
	public Integer gerarCodigoUnico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String converterData(Date data) {
		// TODO Auto-generated method stub
		return null;
	}

}
