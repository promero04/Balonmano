package domain;

public class Entrenador {
    private String nombre;
    private Equipo equipo;
	
    public Entrenador(String nombre, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}
    

    public Entrenador() {
		super();
		this.nombre = "";
		this.equipo = null;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}
    
 
}
