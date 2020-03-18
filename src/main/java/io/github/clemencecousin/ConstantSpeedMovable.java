package io.github.clemencecousin;

// TODO: Auto-generated Javadoc
/**
 * The Class ConstantSpeedMovable.
 */
public class ConstantSpeedMovable implements MovableObject {
	
	/** The speed. Here, we can already know that every object will move at this speed in km/hour*/
	final private double speed = 8.0;
	
	/**
	 * Instantiates a new constant speed movable.
	 */
	ConstantSpeedMovable() {
	}
	
	/**
	 * Say whether an object can accelerate or not.
	 * Here we move at constant speed so the object cannot accelerate
	 * @return true, if successful
	 */
	@Override
	public boolean canAccelerate() {
		return false;
	}
	
	/**
	 * Here, we will not redefined the method as the object move at constant speed.
	 */
	@Override
	public void accelerate() {
	}
	
	/**
	 * Gets the time to move.
	 *
	 * @param distance the distance
	 * @return the time to move
	 */
	@Override
	public double getTimeToMove(double distance) {
		return (distance/this.speed);
	}
	
	/**
	 * Here, we will not redefined the method brake as the object move at constant speed.
	 */
	@Override
	public void brake() {
	}

}
