package Model;

import java.util.List;

public class Leilao {
	private int id;
	private Produtos produto;
	private Boolean encerrado;
	private List<Lances> lstLances;
	
	public Leilao(Produtos produto, Boolean encerrado, List<Lances> lstLances, int id) {
		this.produto = produto;
		this.encerrado = encerrado;
		this.lstLances = lstLances;
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Produtos getProduto() {
		return produto;
	}
	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	public Boolean getEncerrado() {
		return encerrado;
	}
	public void setEncerrado(Boolean encerrado) {
		this.encerrado = encerrado;
	}
	public List<Lances> getLances() {
		return lstLances;
	}
	public void setLances(List<Lances> lstLances) {
		this.lstLances = lstLances;
	}
	
}
