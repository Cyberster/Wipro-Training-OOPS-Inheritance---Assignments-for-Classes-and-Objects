/*
 * Create a class Box that uses a parameterized method to initialize the dimensions 
 * of a box.(dimensions are width, height, depth of double type). The class should 
 * have a method that can return volume. Obtain an object and print the corresponding 
 * volume in main() function.
 * */
package com.w3epic.wiprotraining;

class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getVolume() {
		return width * height * depth;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Box box = new Box(16, 9, 4);
		System.out.println(box.getVolume());
	}

}
