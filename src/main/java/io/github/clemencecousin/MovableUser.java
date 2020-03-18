package io.github.clemencecousin;

public class MovableUser {
	
	public static double getTotalTime (MovableObject M) {
		
		double totaltime = 0.0;
		totaltime = totaltime + M.getTimeToMove(1);
		M.brake();
		totaltime = totaltime + M.getTimeToMove(0.1);
		M.accelerate();
		totaltime = totaltime + M.getTimeToMove(1);
		return totaltime;
	}

	public static void main(String[] args) {
		
		ConstantSpeedMovable constant = new ConstantSpeedMovable();
		GenericMovable G1 = new GenericMovable();
		GenericMovable G2 = new GenericMovable(5.0);
		System.out.println("It takes " + getTotalTime(constant) + " minutes in total for Object1");
		System.out.println("It takes " + getTotalTime(G1) + " minutes in total for Object2");
		System.out.println("It takes " + getTotalTime(G2) + " minutes in total for Object3");

	}

}
