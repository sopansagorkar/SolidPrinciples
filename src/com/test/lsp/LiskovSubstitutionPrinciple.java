package com.test.lsp;

public class LiskovSubstitutionPrinciple {

	static void testDrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}

	public static void main(String[] args) {
			testDrive(new Vehicle());
			testDrive(new Bike());
			testDrive(new Car());
	}

}
