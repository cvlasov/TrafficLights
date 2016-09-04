package trafficLight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Bulb
{
	private Color onColour;
	private Color offColour = Color.BLACK;
	private Color currentColour = offColour;
	private int size;
	private int x;
	private int y;
	private boolean isOn = false;
	
	public Bulb (int xCoord, int yCoord, Color c, int d)
	{
		x = xCoord;
		y = yCoord;
		onColour = c;
		size = d;
	}
	
	public boolean isOn()
	{
		return isOn;
	}
	
	public Color getColour()
	{
		return onColour;
	}
	
	public void change()
	{
		if (isOn())
			currentColour = offColour;
		else
			currentColour = onColour;

		isOn = ! isOn ();
	}
	
	public int getX()
	{
	   return x;
	}
	
	public int getY()
   {
      return y;
   }
	
	public void display (Graphics g)
	{
	   ((Graphics2D) g).setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	   g.setColor(currentColour);			// light
		g.fillOval(x - size/2, y - size/2, size, size);
		g.setColor(offColour);				// outline
		g.drawOval(x - size/2, y - size/2, size, size);
	}
}