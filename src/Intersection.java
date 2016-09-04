package trafficLight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;

public class Intersection
{
   Panel panel;
   Point center = new Point (0,0);
   
   public Intersection (Panel frame, int x, int y)
   {
      this.panel = frame;

      center.x = x;
      center.y = y;

      this.bulbColours = new Color[] {Color.RED, Color.YELLOW, Color.GREEN};

      this.lights = new Light[]
      {   
         new Light(center.x,                    center.y - 2*Light.DIAMETER,  bulbColours),
         new Light(center.x - 3*Light.DIAMETER, center.y,                       bulbColours),
         new Light(center.x,                    center.y + 2*Light.DIAMETER,  bulbColours),
         new Light(center.x + 3*Light.DIAMETER, center.y,                       bulbColours),
      };
   }
   
   
   private Color[] bulbColours;
   private Light[] lights;
   
   private Color[][] states = new Color[][]
   { {Color.GREEN,    Color.RED,      Color.GREEN,    Color.RED},
     {Color.YELLOW,   Color.RED,      Color.YELLOW,   Color.RED},
     {Color.RED,      Color.RED,      Color.RED,      Color.RED},
     {Color.RED,      Color.GREEN,    Color.RED,      Color.GREEN},
     {Color.RED,      Color.YELLOW,   Color.RED,      Color.YELLOW},
     {Color.RED,      Color.RED,      Color.RED,      Color.RED}};
   
   private int currentState = 0;
   private int[] stateTiming = new int[] {5000, 3000, 1000, 5000, 3000, 1000};
   
   private void updateState()
   {   
      for (int i = 0 ; i < lights.length ; i++)
         lights[i].updateState(states[currentState][i]);

      this.panel.repaint ();
   }
   
   class LoopState extends Thread
   {
      @Override
      public void run()
      {
         //! Intersection is = Intersection.this;
         
         while (true)
         {
            updateState();
            
            try { Thread.sleep(stateTiming[currentState]); } catch (InterruptedException ex) {}
            
            currentState++;
            
            if (currentState == states.length)
               currentState = 0;
         }
      }
   }
   
   public void go()
   {
      LoopState loopState = new LoopState();
      loopState.start();
   }
   
   public void display(Graphics g)
   {
      for (int i = 0 ; i < lights.length ; i++)
      {
         lights[i].display(g);
      }
   }
}