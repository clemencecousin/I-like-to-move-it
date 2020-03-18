package io.github.clemencecousin;

public class MovableUser {
	
	public static double getTotalTime (MovableObject M) {
		
		double totaltime = 0.0;
		
	}

	public static void main(String[] args) {
		
		ConstantSpeedMovable constant = new ConstantSpeedMovable();
		GenericMovable G1 = new GenericMovable();
		GenericMovable G2 = new GenericMovable(5.0);
		
		G1.accelerate();
		System.out.println("It takes " + constant.getTimeToMove(1)*60 + " minutes to move of 1 km for the object ConstantSpeedMovable");
		System.out.println("It takes " + G1.getTimeToMove(1)* 60 + " minutes to move of 1 km for the object GenericMovable");
		System.out.println("It takes " + G2.getTimeToMove(1)*60 + " minutes to move of 1 km for the object GenericMovable");

	}

}
