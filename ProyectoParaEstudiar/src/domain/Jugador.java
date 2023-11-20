package domain;

public class Jugador {
    private String nombre;
    private int numero;
    private int goles;
    private Posicion posicion;
	
    
    public Jugador(String nombre, int numero, int goles, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.goles = goles;
		this.posicion = posicion;
	}
    
    public Jugador() {
		super();
		this.nombre = "";
		this.numero = 0;
		this.goles = 0;
		this.posicion = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public Posicion getStrDePos(String s) {
		Posicion p = Posicion.valueOf(s);
		return p;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numero=" + numero + ", goles=" + goles + ", posicion=" + posicion + "]";
	}
    
    
    

 
}
