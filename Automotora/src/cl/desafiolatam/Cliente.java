package cl.desafiolatam;

public class Cliente extends Persona{
	
	private int edad;
	
	public Cliente(String rut,String nombre,int edad){
		super(rut,nombre);
		this.edad=edad;
			}
	public Cliente() {
			}
	//AGREGANDO METODO DE COMPRAS
	public void comprar() {
		System.out.println("Realizar compras");
			}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", getRut()=" + getRut() + ", getNombre()=" + getNombre() + "]";
	}
	
}
