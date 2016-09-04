package city;

import java.awt.Color;

public class AllConfigs
{
    private static Color DARK_GREEN = new Color(0,150,0);
	private static Color[] threeLights = new Color[] {Color.RED, Color.YELLOW, Color.GREEN};
    private static Color[] fourLights = new Color[] {Color.RED, Color.YELLOW, Color.GREEN, DARK_GREEN};
	
	static IntersectionConfiguration ic3333 = new IntersectionConfiguration()
    {
		private boolean[] lightsPresent = new boolean[] {true, true, true, true};
	    private Color[][] states = new Color[][]
	    		   { {Color.GREEN,    Color.RED,      Color.GREEN,    Color.RED},
	    		     {Color.YELLOW,   Color.RED,      Color.YELLOW,   Color.RED},
	    		     {Color.RED,      Color.RED,      Color.RED,      Color.RED},
	    		     {Color.RED,      Color.GREEN,    Color.RED,      Color.GREEN},
	    		     {Color.RED,      Color.YELLOW,   Color.RED,      Color.YELLOW},
	    		     {Color.RED,      Color.RED,      Color.RED,      Color.RED}};
	    private int[] stateTiming = new int[] {5000, 3000, 1000, 5000, 3000, 1000};
	    private int[] pedestrianCrossing = new int[] {1,-1,-1,0,-1,-1};
	    
		public boolean[] getLightsPresent() {return lightsPresent;}
    	public Color[][] getStates() {return states;}
    	public int[] getTiming() {return stateTiming;}
    	public Color[] getBulbColours() {return threeLights;}
    	public int[] getPedestrianCrossing() {return pedestrianCrossing;}
    };
    
	static IntersectionConfiguration ic4444 = new IntersectionConfiguration()
    {
		private boolean[] lightsPresent = new boolean[] {true, true, true, true};
	    private Color[][] states = new Color[][]
	    		   { {DARK_GREEN,     Color.RED,      DARK_GREEN,     Color.RED},
	    			 {Color.GREEN,    Color.RED,      Color.GREEN,    Color.RED},
	    		     {Color.YELLOW,   Color.RED,      Color.YELLOW,   Color.RED},
	    		     {Color.RED,      Color.RED,      Color.RED,      Color.RED},
	    		     {Color.RED,      DARK_GREEN,     Color.RED,      DARK_GREEN},
	    		     {Color.RED,      Color.GREEN,    Color.RED,      Color.GREEN},
	    		     {Color.RED,      Color.YELLOW,   Color.RED,      Color.YELLOW},
	    		     {Color.RED,      Color.RED,      Color.RED,      Color.RED}};
	    private int[] stateTiming = new int[] {3000, 5000, 3000, 1000, 3000, 5000, 3000, 1000};
	    private int[] pedestrianCrossing = new int[] {-1,1,-1,-1,-1,0,-1,-1};
	    
		public boolean[] getLightsPresent() {return lightsPresent;}
    	public Color[][] getStates() {return states;}
    	public int[] getTiming() {return stateTiming;}
    	public Color[] getBulbColours() {return fourLights;}
    	public int[] getPedestrianCrossing() {return pedestrianCrossing;}
    };
    
	static IntersectionConfiguration ic0333 = new IntersectionConfiguration()
    {
		private boolean[] lightsPresent = new boolean[] {false, true, true, true};
	    private Color[][] states = new Color[][]
	    		   { {null,	Color.RED,      Color.GREEN,    Color.RED},
	    		     {null,	Color.RED,      Color.YELLOW,   Color.RED},
	    		     {null,	Color.RED,      Color.RED,      Color.RED},
	    		     {null,	Color.GREEN,    Color.RED,      Color.GREEN},
	    		     {null,	Color.YELLOW,   Color.RED,      Color.YELLOW},
	    		     {null,	Color.RED,      Color.RED,      Color.RED}};
	    private int[] stateTiming = new int[] {4000, 2000, 1000, 4000, 2000, 1000};
	    private int[] pedestrianCrossing = new int[] {1,-1,-1,0,-1,-1};
	    
		public boolean[] getLightsPresent() {return lightsPresent;}
    	public Color[][] getStates() {return states;}
    	public int[] getTiming() {return stateTiming;}
    	public Color[] getBulbColours() {return threeLights;}
    	public int[] getPedestrianCrossing() {return pedestrianCrossing;}
    };
}