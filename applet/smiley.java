
import java.applet.*;
import java.awt.*;

/*
<applet code = "smiley" width = 500 height = 300>
</applet>
*/


public class smiley extends Applet {
	public void paint(Graphics g)
	{
            g.drawOval(80, 70, 150, 150);
            g.setColor(Color.BLACK);
		g.fillOval(120, 120, 15, 15);
		g.fillOval(170, 120, 15, 15);
		g.drawArc(130, 180, 50, 20, 180, 180);
	}
}
