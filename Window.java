package trafficLight;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame
{
   private static final long serialVersionUID = 1L;

   private TrafficPanel panel = new TrafficPanel();
	
   public static final int WIN_WIDTH  = 800;
   public static final int WIN_HEIGHT = 600;
   
	public Window()
	{
      //!
      addWindowListener(new WindowAdapter()
      {
         @Override
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      });

		setTitle("Traffic Simulator");
  		setSize(WIN_WIDTH, WIN_HEIGHT);				// set the dimensions of the window
		setLocation(100,100);			// set the position of the top�left corner
		setResizable(true);			// the user can change the size of the panel
		add(panel);						// �attach� the panel to the frame
		setVisible(true);  				// display the window on the monitor
	}
}