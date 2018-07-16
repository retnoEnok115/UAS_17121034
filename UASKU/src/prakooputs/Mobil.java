package prakooputs;


import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class Mobil extends Frame{
private static final long serialVersionUID = 1L;
	
	public Mobil() {
		setTitle("Mobil"); //judul windows
	}
	public void paint(Graphics g){
		
		g.drawString("Mobil", 20, 60);
		g.drawLine(20,70,100,70);
		g.drawRect(100,120,160,35);
		g.fillRect(50,145,50,10);
		g.drawRect(50,155,210,25);
		
		g.fillRoundRect(60,170,30,30,30,30);
		g.fillRoundRect(220,170,30,30,30,30);
	}
	public boolean handleEvent(Event evt){
		
		if (evt.id == Event.WINDOW_DESTROY) {
		System.exit(0);
		}
	return false;
	}
	public static void main(String[] args) {
		Frame f = new Mobil();
		f.setSize(300, 500);
		f.setVisible(true);
	}

}
