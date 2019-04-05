package Model;

import java.util.List;

public class SimulaBanco {
	public List<Leilao> lstLeilao;
	public List<Compradores> lstCompradores;
	public List<Produtos> lstProdutos;
	public List<Vendedores> lstVendedores;
	
	public List<Leilao> getLeiloes(){
		return this.lstLeilao;
	}
	public void incluirLeilao(Leilao l) {
		this.lstLeilao.add(l);
	}
	
	public void incluirProduto(Produtos p) {
		this.lstProdutos.add(p);
	}
	
	public List<Produtos> getProdutos(){
		return this.lstProdutos;
	}
	
	public void incluirVendedor(Vendedores v) {
		this.lstVendedores.add(v);
	}
	
	public List<Vendedores> getVendedores(){
		return this.lstVendedores;
	}
	
	
	public List<Compradores> getCompradores(){
		return this.lstCompradores;
	}
	
	public void incluirComprador(Compradores c) {
		this.lstCompradores.add(c);
	}
}
