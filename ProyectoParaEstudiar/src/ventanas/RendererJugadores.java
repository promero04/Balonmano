package ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class RendererJugadores extends DefaultTableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		JLabel label = new JLabel();
		
		//Por defecto el label se centra
		label.setHorizontalAlignment(JLabel.CENTER);
		if(column==0){
			label.setText(value.toString());
			label.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
			
		}
		if(column==1){
			label.setText(value.toString());
			
		}
		if (column == 2) {
			label.setText(value.toString());
			if (Integer.parseInt(value.toString()) >= 1)
			label.setBackground(Color.GREEN);
			
		}
		if(column==3){
			label.setText(value.toString());
			
		}
		
		
		label.setOpaque(true);
		
		return label;	}
	
	

}
