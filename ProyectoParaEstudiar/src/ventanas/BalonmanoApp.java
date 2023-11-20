package ventanas;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BalonmanoApp extends JFrame{
	
	private JPanel panel, pAbajo, pCentro;
	private JButton btnSalir, btnVisualizarJugadores;
	
	
	public BalonmanoApp(){
		
		panel = new JPanel(new BorderLayout());
		pAbajo = new JPanel();
		pCentro = new JPanel();
		
		btnSalir = new JButton("salir");
		btnVisualizarJugadores = new JButton("ver jugadores");
		getContentPane().add(panel);
		panel.add(pAbajo, BorderLayout.SOUTH);
		panel.add(pCentro, BorderLayout.NORTH);
		pAbajo.add(btnSalir);
		pCentro.add(btnVisualizarJugadores);
		
		
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		} );
		
		btnVisualizarJugadores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaJugadores();
				
				
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

}
