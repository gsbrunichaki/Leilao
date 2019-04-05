package Model;

import java.util.List;

public class Leilao {
	private Produtos produto;
	private Boolean encerrado;
	private List<Lances> lstLances;
	
	public Leilao(Produtos produto, Boolean encerrado, List<Lances> lstLances) {
		this.produto = produto;
		this.encerrado = encerrado;
		this.lstLances = lstLances;
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
