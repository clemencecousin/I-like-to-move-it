package io.github.clemencecousin;

// TODO: Auto-generated Javadoc
/**
 * The Interface MovableObject.
 */
public interface MovableObject {
	
	/**
	 * Say if an object can accelerate.
	 *
	 * @return true, if successful
	 */
	public boolean canAccelerate();
	
	/**
	 * Accelerate the speed of the object if possible.
	 */
	public void accelerate();
	
	/**
	 * Gets the time an object need to move on a certain distance.
	 *
	 * @param number the number
	 * @return the time to move
	 */
	public double getTimeToMove(double distance);
	
	public void brake();
	
}
