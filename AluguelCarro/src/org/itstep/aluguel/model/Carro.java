package org.itstep.aluguel.model;

public class Carro {

	
	//Atributos comuns
	private Integer  		codCarro;
	private String 			modelo;
	private String 			montadora;
	private int 			anoFab;
	private String 			cor;
	private int 			numChassi;
	private String 			placa;
	private Categoria 		categoria;
	private TabelaPreco		tabelaPreco;
	private String			responsavel;
	
	//Getter and Setter
	

	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public  Integer getCodCarro() {
		return codCarro;
	}
	public  void setCodCarro(Integer cCarro) {
		codCarro = cCarro;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getNumChassi() {
		return numChassi;
	}
	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public TabelaPreco getTabelaPreco() {
		return tabelaPreco;
	}
	public void setTabelaPreco(TabelaPreco tabelaPreco) {
		this.tabelaPreco = tabelaPreco;
	}
	

}
