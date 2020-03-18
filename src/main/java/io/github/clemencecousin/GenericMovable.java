package io.github.clemencecousin;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericMovable.
 */
public class GenericMovable implements MovableObject{
	
	/** The speed in km/hour. */
	private double speed;
	
	/**
	 * Instantiates a new generic movable.
	 *
	 * @param speed the speed
	 */
	GenericMovable (double speed) {
		this.speed = speed;
	}
	
	/**
	 * Instantiates a new generic movable by default.
	 */
	GenericMovable (){
		this.speed = 10.0;
	}
	
	/**
	 * A generic movable can accelerate.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean canAccelerate() {
		return true;
	}
	
	/**
	 * By default we accelerate the speed by one.
	 */
	@Override
	public void accelerate() {
		this.speed = this.speed + 1;
	}
	
	/**
	 * Gets the time to move.
	 *
	 * @param distance the distance in kilometers
	 * @return the time to move in minutes
	 */
	@Override
	public double getTimeToMove (double distance) {
		return (distance/this.speed) * 60;
	}
	
	/**
	 * Reduce the speed of an object.
	 */
	@Override
	public void brake() {
		this.speed = this.speed - 1;
	}
}
