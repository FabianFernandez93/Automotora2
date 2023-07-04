package cl.desafiolatam;

public class Tienda {
	private String nombreTienda;
	private int stock;
	private Cliente cliente;
	private Vendedor vendedor;
	
	public Tienda(String nombreTienda,int stock,Vendedor vendedor,Cliente cliente) {
		this.nombreTienda=nombreTienda;
		this.stock=stock;
		this.cliente=cliente;
		this.vendedor=vendedor;
	}
	public Tienda() {
		 cliente = new Cliente();
		vendedor = new Vendedor();
	}

	public void existeStock() {
		System.out.println("existen: "+stock+"en stock");
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	@Override
	public String toString() {
		return "Tienda [nombreTienda=" + nombreTienda + ", stock=" + stock + ", cliente=" + cliente + ", vendedor="
				+ vendedor + "]";
	}
	


}
