package Model;

public class Produtos {
	private String nome;
	private String categoria;
	private double precoInicial;
	private Vendedores vendedor;
	
	public Produtos(String nome, String categoria, double precoInicial, Vendedores vendedor) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.precoInicial = precoInicial;
		this.vendedor = vendedor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecoInicial() {
		return precoInicial;
	}
	public void setPrecoInicial(double precoInicial) {
		this.precoInicial = precoInicial;
	}
	public Vendedores getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedores vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
}
