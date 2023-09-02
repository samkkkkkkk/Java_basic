package oop.abs.quiz;

public class Circle extends Shape{
	
	private int radius;
	
	
	public Circle() {}
	
	public void Cricle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		
		return this.radius * this.radius;
	}
}
