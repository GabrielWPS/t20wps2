package org.itstep.aluguel.model;

import java.util.Date;

public class PessoaJuridica extends Pessoa {

	// Atributo
	private String cnpj;
	private String responsavel;

	// Getter and Setter

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
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
