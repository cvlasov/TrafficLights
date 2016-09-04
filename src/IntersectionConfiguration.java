/* To do:
 * - location coordinates
 * - Light array
 * - states
 * 
 */

package city;

import java.awt.Color;

public interface IntersectionConfiguration
{
	public boolean[] getLightsPresent();
	public Color[][] getStates();
	public int[] getTiming();
	public Color[] getBulbColours();
	public int[] getPedestrianCrossing();
}