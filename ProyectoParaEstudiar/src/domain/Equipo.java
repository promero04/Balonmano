package domain;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
	
    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

    public Equipo() {
		super();
		this.nombre = "";
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
    

    
}

