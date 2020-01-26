import java.applet.*;
import java.awt.*;

public class Smile extends Applet
{
	public void init()
	{
		//setBackground(Color.PINK);
		setBackground(Color.RED);
	}
	public void paint(Graphics g)
	{
		g.drawOval(40,40,120,150);
		g.drawOval(57,75,30,20);
		g.setColor(Color.GREEN);
		g.drawOval(68,81,10,10);
		g.drawOval(121,81,10,10);
		g.setColor(Color.YELLOW);
		g.drawOval(85,100,30,30);
		g.setColor(Color.BLUE);
		g.drawArc(60,125,80,40,180,180);
		g.drawOval(25,92,15,30);
		g.drawOval(160,92,15,30);
	}
}