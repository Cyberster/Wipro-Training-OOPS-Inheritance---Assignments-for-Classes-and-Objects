package com.w3epic.wiprotraining;

class Patient {
	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		// BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
		return ( weight / ( height * height ) ) * 703;
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Patient patient = new Patient("Arpan Das", 177/2.54, 59*2.2);
		
		System.out.println(patient.BMI());

	}

}
