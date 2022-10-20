package P1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
public class Cycle   implements  ActionListener,Subject{
	
	public Timer timer;
	public EspaceCouleur espacecolor ; 
	public CompteurPub  cptpub; 
	
	public Cycle(EspaceCouleur espacecolor,CompteurPub cptpub) {
		timer = new Timer(2000,this);
		timer.start();
		
		this.v.add(espacecolor);
		this.v.add(cptpub);
		
		
        
		
	}
	
	
		public void add (Observer a) {
			this.v.add(a);
		}

		public void remove (Observer a) {
			this.v.remove(a);
		}
		
		public void notif () {
			System.out.println("Notification envoyé ");
		
		}


		
		@Override
		 public void actionPerformed(ActionEvent e) {
        	
        	for (Observer o : v) {
				
        		o.MAJ();
			}
        
        }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			JFrame f = new JFrame();
		    EspaceCouleur espacecolor = new EspaceCouleur(Color.black); 
		    CompteurPub  cptpub = new CompteurPub();
		    Cycle c =  new Cycle(espacecolor,cptpub);
			f.add(cptpub);
			f.add(espacecolor);
			f.setLayout(new FlowLayout());
			f.setSize(300, 200);  
			
	        f.setLocationRelativeTo(null);  
	        f.setLocation(10, 40);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        
	        f.setVisible(true); 
			
		}
		
		
		
	
}
