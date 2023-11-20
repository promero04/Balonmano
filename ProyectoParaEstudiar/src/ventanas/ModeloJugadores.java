package ventanas;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import domain.Jugador;


public class ModeloJugadores extends DefaultTableModel{
	private List<String> titulos = Arrays.asList("NOMBRE", "NUMERO", "GOLES", "POSICION");
	private List<Jugador> lJugadores;
	
	
	public ModeloJugadores(List<Jugador> lj) {
		lJugadores = lj;
	}
	

	@Override
	public int getRowCount() {
		if(lJugadores == null) 
			return 0;
		return lJugadores.size();
	}
	
	

	@Override
	public int getColumnCount() {
		return titulos.size();
	}

	@Override
	public String getColumnName(int column) {
		return titulos.get(column);
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		Jugador j1 = lJugadores.get(row); 
		switch (column) {
		case 0: return j1.getNombre();
		case 1: return j1.getNumero();
		case 2: return j1.getGoles();
		case 3: return j1.getPosicion();
	
		default: return null;
		}
	}

	@Override
	public void setValueAt(Object aValue, int row, int column) {
		
		super.setValueAt(aValue, row, column);
	}
	

}
