package ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import domain.Contenedora;
import domain.Jugador;
import domain.Posicion;

public class VentanaJugadores extends JFrame{
	private JPanel panel, pAbajo, pCentro, pArriba;
	private JButton btnSalir, btnTodos;
	
	private JComboBox<String> comboJugadores;
	
	private Map<String, List<Jugador>> mapaJugadoresPornombre = new HashMap<>();
	private Map<Integer, List<Jugador>> mapaJugadoresPorDorsal = new HashMap<>();
	
	private ModeloJugadores modeloJugadores;
	private JTable tablaJugadores;
	private JScrollPane scrollJugadores;
	
	private DefaultListModel<Jugador> modeloListaJugadores;
	private JList<Jugador> listaJugadores;
	private JScrollPane scrollLista;
	
	private Contenedora c;
	
	public VentanaJugadores(){
		cargarContenedora();
		
		
		panel = new JPanel(new BorderLayout());
		pAbajo = new JPanel();
		pCentro = new JPanel(new GridLayout(2,1));
		pArriba = new JPanel();
		comboJugadores = new JComboBox<>();
		for(Jugador j: c.getLJugadores()) {
			comboJugadores.addItem(j.getNombre());
		}
		
		btnTodos = new JButton("Visualizar jugadoores");
		btnSalir = new JButton("salir");
		getContentPane().add(panel);
		panel.add(pAbajo, BorderLayout.SOUTH);
		panel.add(pCentro, BorderLayout.NORTH);
		pAbajo.add(btnSalir);
		
		
		modeloJugadores = new ModeloJugadores(c.getLJugadores());
		tablaJugadores = new JTable(modeloJugadores);
		scrollJugadores = new JScrollPane(tablaJugadores);
		tablaJugadores.setDefaultRenderer(Object.class, new RendererJugadores());
		tablaJugadores.setModel(modeloJugadores);
		
		pArriba.add(comboJugadores);
		pArriba.add(btnTodos);
		pCentro.add(scrollJugadores);

		modeloListaJugadores = new DefaultListModel<>();
		listaJugadores = new JList<Jugador>(modeloListaJugadores);
		scrollLista = new JScrollPane(listaJugadores);
		
		scrollLista.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
		scrollLista.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		pCentro.add(pArriba);
		pArriba.add(scrollLista);
		
		
		btnTodos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablaJugadores.setModel(new ModeloJugadores(c.getLJugadores()));
				
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		} );
		comboJugadores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String selec = comboJugadores.getSelectedItem().toString();
				List<Jugador> lista = c.getLJugadoresNombre(selec);
				
				
				tablaJugadores.setModel(new ModeloJugadores(lista));
				
				
			}
		});
		tablaJugadores.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Point p = e.getPoint();
				
				int fila = tablaJugadores.rowAtPoint(p);
				
				
			
				if (e.getClickCount() == 2) {
					modeloListaJugadores.clear();
					String nombre = tablaJugadores.getModel().getValueAt(fila, 0).toString();
					int numCamiseta = Integer.parseInt(tablaJugadores.getModel().getValueAt(fila, 1).toString());
					int numGoles = Integer.parseInt(tablaJugadores.getModel().getValueAt(fila, 2).toString());
					String posicion = tablaJugadores.getModel().getValueAt(fila, 3).toString();
					Jugador j = new Jugador(nombre, numCamiseta, numGoles, null);
					modeloListaJugadores.addElement(j);
					
				}
				
			}
		});
		
	
		
		setVisible(true);
		int anchoPantalla = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
		int altoPantalla = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
		setSize(anchoPantalla, altoPantalla);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		
		
	}
	private void cargarContenedora() {
		
		c = new Contenedora();
		
		Jugador j1 = new Jugador("LAJAS", 19, 0, Posicion.LATERAL_IZQUIERDO);
		Jugador j2 = new Jugador("JULEN", 4, 0, Posicion.LATERAL_IZQUIERDO);
		Jugador j3 = new Jugador("ARKADI", 17, 0, Posicion.LATERAL_IZQUIERDO);
		Jugador j4 = new Jugador("PABLO", 18, 15, Posicion.LATERAL_IZQUIERDO);
		Jugador j5 = new Jugador("BORJA", 24, 0, Posicion.LATERAL_DERECHO);
		Jugador j6 = new Jugador("UNAI", 23, 0, Posicion.LATERAL_DERECHO);
		Jugador j7 = new Jugador("MIMI", 14, 0, Posicion.PIVOTE);
		Jugador j8 = new Jugador("RUBEN", 13, 0, Posicion.EXTREMO_DERECHO);
		Jugador j9 = new Jugador("JAIME", 18, 10, Posicion.EXTREMO_DERECHO);
		Jugador j10 = new Jugador("LARRABIDE", 11, 0, Posicion.PIVOTE);
		Jugador j11 = new Jugador("AARON", 10, 0, Posicion.CENTRAL);
		Jugador j12 = new Jugador("JUANPE", 33, 0, Posicion.CENTRAL);
		Jugador j13 = new Jugador("HODEI", 2, 0, Posicion.EXTREMO_IZQUIERDO);
		Jugador j14 = new Jugador("AYALA", 9, 0, Posicion.LATERAL_DERECHO);
		Jugador j15 = new Jugador("JAVI", 4, 0, Posicion.PORTERO);
		Jugador j16 = new Jugador("ARRE", 12, 0, Posicion.PORTERO);
		
		
		c.aniadirJugador(j1);
		c.aniadirJugador(j2);
		c.aniadirJugador(j3);
		c.aniadirJugador(j4);
		c.aniadirJugador(j5);
		c.aniadirJugador(j6);
		c.aniadirJugador(j7);
		c.aniadirJugador(j8);
		c.aniadirJugador(j9);
		c.aniadirJugador(j10);
		c.aniadirJugador(j11);
		c.aniadirJugador(j12);
		c.aniadirJugador(j13);
		c.aniadirJugador(j14);
		c.aniadirJugador(j15);
		c.aniadirJugador(j16);
		
		
		c.aniadirJugadoresPorNombre(getName(), j1);
		c.aniadirJugadoresPorNombre(getName(), j2);
		c.aniadirJugadoresPorNombre(getName(), j3);
		c.aniadirJugadoresPorNombre(getName(), j4);
		c.aniadirJugadoresPorNombre(getName(), j5);
		c.aniadirJugadoresPorNombre(getName(), j6);
		c.aniadirJugadoresPorNombre(getName(), j7);
		c.aniadirJugadoresPorNombre(getName(), j8);
		c.aniadirJugadoresPorNombre(getName(), j9);
		c.aniadirJugadoresPorNombre(getName(), j10);
		c.aniadirJugadoresPorNombre(getName(), j12);
		c.aniadirJugadoresPorNombre(getName(), j13);
		c.aniadirJugadoresPorNombre(getName(), j14);
		c.aniadirJugadoresPorNombre(getName(), j15);
		c.aniadirJugadoresPorNombre(getName(), j16);
		
		List<Jugador> jugadoresCorasA = new ArrayList<>();
		
		jugadoresCorasA.add(j1);
		jugadoresCorasA.add(j2);
		jugadoresCorasA.add(j3);
		jugadoresCorasA.add(j4);
		jugadoresCorasA.add(j5);
		jugadoresCorasA.add(j6);
		jugadoresCorasA.add(j7);
		jugadoresCorasA.add(j8);
		jugadoresCorasA.add(j9);
		jugadoresCorasA.add(j10);
		jugadoresCorasA.add(j11);
		jugadoresCorasA.add(j12);
		jugadoresCorasA.add(j13);
		jugadoresCorasA.add(j14);
		jugadoresCorasA.add(j15);
		jugadoresCorasA.add(j16);
		
		c.aniadirEquipo("CorasA", jugadoresCorasA);
	}

}
