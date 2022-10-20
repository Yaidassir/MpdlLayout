package P1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

class EspaceCouleur extends JPanel implements Observer{
	Color color = Color.black;
	public EspaceCouleur(Color c){
		this.color = c;	
		this.setPreferredSize(new Dimension(90,90));
		this.setBackground(this.color);
		
	
	}	
	
	

@Override
public void MAJ() {
	// TODO Auto-generated method stub
	
	if(this.getBackground()== Color.black) {
		
		this.setBackground(Color.blue);
	}else {
		
		this.setBackground(Color.black);
		
	}
}
}
