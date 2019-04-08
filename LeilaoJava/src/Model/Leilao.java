package Model;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private int id;
	private Produtos produto;
	private Boolean encerrado;
	private List<Lances> lstLances = new ArrayList<Lances>();
	
	public Leilao(int id,Produtos produto, Boolean encerrado, List<Lances> lstLances) {
		this.produto = produto;
		this.encerrado = encerrado;
		this.lstLances = lstLances;
		this.id = id;
	}
	public Leilao() {
		
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
