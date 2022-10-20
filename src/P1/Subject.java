package P1;

import java.awt.event.ActionListener;
import java.util.ArrayList;

abstract interface Subject {
	
	static ArrayList<Observer> v = new ArrayList();
	
	public void add(Observer a);
	public void remove(Observer a) ;
	public void notif() ;
}
