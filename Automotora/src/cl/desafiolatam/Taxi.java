package cl.desafiolatam;

public class Taxi extends Vehiculo{
	
	private int valorPasaje;
	
	public Taxi (String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje=valorPasaje;
	}
	
	public void pagarPasaje() {		
		System.out.println("Pagar pasaje: "+valorPasaje);
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + ", getColor()=" + getColor() + ", getPatente()=" + getPatente()
				+ "]";
	}


}