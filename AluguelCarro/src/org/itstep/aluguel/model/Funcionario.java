package org.itstep.aluguel.model;

import java.util.Date;

public class Funcionario extends PessoaFisica {
	
	//Atributo
	private Double salario;
	private Date dtAdimissao;
	private Date dtDemissao;
	private Cargo cargo;

	
	
	//Getter and Setter
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Date getDtAdimissao() {
		return dtAdimissao;
	}
	public void setDtAdimissao(Date dtAdimissao) {
		this.dtAdimissao = dtAdimissao;
	}
	public Date getDtDemissao() {
		return dtDemissao;
	}
	public void setDtDemissao(Date dtDemissao) {
		this.dtDemissao = dtDemissao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	
}
