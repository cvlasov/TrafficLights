package trafficLight;

import java.awt.Color;
import java.awt.Graphics;

public class Light
{
	private Bulb[] bulbs;
	public static final int DIAMETER = 50;
	
	public Light(int x, int y, Color[] c)
	{
		bulbs = new Bulb[c.length];
		
		for (int i = 0 ; i < bulbs.length ; i++)
		{
			bulbs[i] = new Bulb(x, y + i*DIAMETER, c[i], DIAMETER);
		}
	}
	
	public void updateState(Color c)
	{
		for (int i = 0 ; i < bulbs.length ; i++)
		{
			Bulb b = bulbs[i];
			
			if (b.isOn())
				b.change();
			
			if (b.getColour() == c)
				b.change();
		}
	}
	
	public void display(Graphics g)
	{   
      Bulb b = bulbs[0];
      int bulbCount = bulbs.length;
	   g.setColor(Color.BLACK);
      g.drawRect(b.getX() - bulbCount*DIAMETER/4, b.getY() - bulbCount*DIAMETER/4, bulbCount*DIAMETER/2, 7*DIAMETER/2);
	   
	   for (int i = 0 ; i < bulbs.length ; i++)
		{
			bulbs[i].display(g);
		}
	}
}