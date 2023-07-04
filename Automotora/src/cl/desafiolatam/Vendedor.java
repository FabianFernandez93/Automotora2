package cl.desafiolatam;

public class Vendedor extends Persona{
	
	private String direccion;
	
	public Vendedor(String rut,String nombre,String direccion) {
		super(rut,nombre);	
		this.direccion=direccion;
			}
	public Vendedor() {
			}
	public void vender() {
		System.out.println("realizar una venta");
			}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + ", getRut()=" + getRut() + ", getNombre()=" + getNombre() + "]";
	}
	

}
