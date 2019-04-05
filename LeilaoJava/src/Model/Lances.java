package Model;

public class Lances {
	private Compradores comprador;
	private double valor;
	
	public Lances(Compradores comprador, double valor) {
		super();
		this.comprador = comprador;
		this.valor = valor;
	}

	public Compradores getComprador() {
		return comprador;
	}

	public void setComprador(Compradores comprador) {
		this.comprador = comprador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
