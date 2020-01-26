import java.awt.*;
import java.applet.*;

public class Smiley extends Applet
{
	public void paint(Graphics g)
	{
		
		g.drawOval(25,25, 25,25);
		g.drawOval(85,25, 25,25);
		
		int x[] ={68,60,76,68};
		int y[]={55, 75, 75, 55};
		
		g.drawPolygon(x,y,4);
		
		g.drawArc(35, 85, 78, 20, 180,180);

		//g.drawLine(68,55, 68, 75);
		
		/*g.drawLine(68,55, 60, 75);
		g.drawLine(60,75, 76, 75);
		g.drawLine(68,55, 76, 75);
		*/
		
		
		
	}
}