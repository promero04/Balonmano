package domain;

import java.util.ArrayList;

public class Liga {
    private String nombre;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
	
    public Liga(String nombre, ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
		super();
		this.nombre = nombre;
		this.equipos = equipos;
		this.partidos = partidos;
	}

    public Liga() {
		super();
		this.nombre = "";
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", equipos=" + equipos + ", partidos=" + partidos + "]";
	}
    
}
