package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contenedora {
	private List<Jugador> lJugadores = new ArrayList<>();
	private List<Equipo> lEquipo = new ArrayList<>();
	private Map<String, List<Jugador>> mapaJugadoresPornombre = new HashMap<>();
	private Map<Integer, List<Jugador>> mapaJugadoresPorDorsal = new HashMap<>();
	private Jugador j;
	
	public void aniadirJugador(Jugador j) {
		lJugadores.add(j);
		
		
	}
	public List<Jugador> getLJugadores(){
	    return lJugadores;
	}
	
	
	public void aniadirEquipo(Equipo e) {
		lEquipo.add(e);
		
		
	}
	public List<Equipo> getlEquipo(){
	    return lEquipo;
	}
	public void aniadirEquipo(String string, List<Jugador> jugadoresCorasA) {
		Equipo e = new Equipo();
		lEquipo.add(e);
		
	}
	public Jugador getJ() {
		return j;
	}
	public String getJugadorPornombre(){
		List<Jugador> lJ = new ArrayList<>();
		
		for(Jugador j: lJ) {
			return j.getNombre();
		}
		return null;
		
		
	}
	
	public Map<String, List<Jugador>> getMapaJugadoresPornombre() {
		return mapaJugadoresPornombre;
	}
	public void aniadirJugadoresPorNombre(String string, Jugador j) {
		
		if(!mapaJugadoresPornombre.containsKey(j.getNombre())) {
			mapaJugadoresPornombre.put(j.getNombre(), new ArrayList<>());
			
		}
		mapaJugadoresPornombre.get(j.getNombre()).add(j);
		
		
		
		
		
	}
	public List<Jugador> getLJugadoresNombre(String nombre){
	    return mapaJugadoresPornombre.get(nombre);
	}
	
	public void aniadirJugadoresPorDorsal(Integer i, Jugador j) {
		
		if(!mapaJugadoresPorDorsal.containsKey(j.getNumero())) {
			mapaJugadoresPorDorsal.put(j.getNumero(), new ArrayList<>());
			
		}
		mapaJugadoresPorDorsal.get(j.getNumero()).add(j);
		
		
		
		
		
	}
	public List<Jugador> getJugadoresPorNumero(int numId) {
		List<Jugador> lj = new ArrayList<>();
		for (Integer dorsal: mapaJugadoresPorDorsal.keySet()) {
			List<Jugador> listadorsal = mapaJugadoresPorDorsal.get(dorsal);
			for(Jugador j : listadorsal) {
				if (j.getNumero()==numId) {
					lj.addAll(mapaJugadoresPorDorsal.get(listadorsal));
				}
				
			}
		}
		return lj;
	}

	
	
}
