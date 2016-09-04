package trafficLight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;

public class TrafficPanel extends Panel // implements MouseListener, MouseMotionListener
{
   private static final long serialVersionUID = 1L;

	private Intersection intersection = null;
	private Color bgColor = Color.LIGHT_GRAY;
	private Dimension dim = new Dimension(0,0); // dimensions of the panel
	private BufferedImage osi;	// the reference to the memory, off-screen image (OSI)
	private Graphics osg;	// the reference to the graphics, off-screen graphics (OSG)
	

	public TrafficPanel()
	{
		setBackground(Color.LIGHT_GRAY);

      if (intersection == null)
      {
       //intersection = new Intersection(this, getSize().width/2, getSize().height/2);
         intersection = new Intersection(this, Window.WIN_WIDTH/2, Window.WIN_HEIGHT/2);
         intersection.go();
         repaint();  // method exists in class Panel
      }
	}

	
	@Override
   public void paint (Graphics g)
	{
		Dimension d = getSize();
		
		if (!dim.equals(d))
		{
			dim = d;
			osi = new BufferedImage (dim.width, dim.height, BufferedImage.TYPE_INT_RGB);
			osg = osi.getGraphics();
		}
		
		update (g);
	}

	
	@Override
   public void update (Graphics g)
	{	
		osg.setColor(bgColor);	// background color
		
		osg.fillRect(0, 0, dim.width, dim.height);
		
		if (intersection != null)
			intersection.display(osg);

		g.drawImage(osi, 0, 0, this);
	}
}