package cl.desafiolatam;

public class Bus extends Vehiculo{

	
	private int cantidadAsientos;
	
	public Bus(String color, String patente, int cantidadAsientos) {
		super(color,patente);
		this.cantidadAsientos=cantidadAsientos;
	}
	
	public Bus() {
		}
	
	public void asientosDisponibles() {
		System.out.print("Asientos Disponibles: "+cantidadAsientos);
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	@Override
	public String toString() {
		return "Bus [cantidadAsientos: " + cantidadAsientos + ", Color: " + getColor() + ", Patent: "
				+ getPatente() + "]";
	}


}
