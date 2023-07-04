package cl.desafiolatam;

public class MiniBus extends Vehiculo{
	
	private String tipoViaje;
	private int cantidadAsientos;
	
	public MiniBus (String color, String patente, String tipoViaje, int cantidadAsientos) {
		super(color,patente);
		this.cantidadAsientos=cantidadAsientos;
		this.tipoViaje=tipoViaje;
	}
	public MiniBus () {
		}
	public void imprimeBus() {
		System.out.println(" Imprime bus" );
	}
	public String getTipoViaje() {
		return tipoViaje;
	}
	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	@Override
	public String toString() {
		return "MiniBus [tipoViaje: " + tipoViaje + ", cantidadAsientos: " + cantidadAsientos + ", Color: "
				+ getColor() + ", Patente: " + getPatente() + "]";
	}


}
