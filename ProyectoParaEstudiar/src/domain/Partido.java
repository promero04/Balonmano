package domain;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
	
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesEquipoLocal = golesEquipoLocal;
		this.golesEquipoVisitante = golesEquipoVisitante;
	}
    
    public Partido() {
  		super();
  		this.equipoLocal = null;
  		this.equipoVisitante = null;
  		this.golesEquipoLocal = 0;
  		this.golesEquipoVisitante = 0;
  	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesEquipoLocal() {
		return golesEquipoLocal;
	}

	public void setGolesEquipoLocal(int golesEquipoLocal) {
		this.golesEquipoLocal = golesEquipoLocal;
	}

	public int getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}

	public void setGolesEquipoVisitante(int golesEquipoVisitante) {
		this.golesEquipoVisitante = golesEquipoVisitante;
	}

	@Override
	public String toString() {
		return "Partido [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", golesEquipoLocal="
				+ golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}
    
    
    
}
