package P1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

class CompteurPub extends JLabel implements Observer{
		
		public int nbcycle = 0;
		public CompteurPub() {
			this.setText("Nombre de pubprésentées : 0");
			
		}

		public void MAJ() {
			// TODO Auto-generated method stub
				
				this.nbcycle++;
				this.setText("Nombre de pubprésentées : "+nbcycle);
		}
		
		

}
