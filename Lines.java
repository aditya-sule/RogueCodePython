import java.awt.*;
import java.applet.*;

public class Lines extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(25,25,75,25);
		
		g.drawRect(25,45,25,25);
		
		
		Color r = new Color(128,0,65);
		g.setColor(r);
		
		//g.setColor(Color.);
		g.drawRect(25,85,75,25);
		
		
		g.fillRect(25,130,75,25);
		
		/*Color b = new Color(0,0,0);
		g.setColor(b);
		g.drawRoundRect(25,175,75,25,25,25);
		
		
		
		g.drawOval(25,215,75,25);
		
		
		Color blue = new Color(0,0,255);
		g.setColor(blue);
		g.drawOval(25,260,75,25);
		
		
		g.fillOval(25,305,75,25);
		
		g.drawOval(25,350,25,25);*/
		
		
		
	}
}