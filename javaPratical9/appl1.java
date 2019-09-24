import java.applet.*;
import java.awt.*;
public class appl1 extends Applet
{

	 public void paint (Graphics g) {
	    String squareSizeParam = getParameter ("squareSize");
	   // parseSquareSize (squareSizeParam);

	    String colorParam = getParameter ("color");
	    Color fg = Color.getColor(colorParam);
		g.drawString(colorParam,10,100);
	    setBackground (Color.BLUE);
	    //setForeground (fg);
	 }


}