package domain;

public class Arbitro {
    private String nombre;

	public Arbitro(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Arbitro() {
		super();
		this.nombre = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Arbitro [nombre=" + nombre + "]";
	}
	
}
