package fr.mds.axel.java.model;

public class ShapeMaker implements Shape {
	
	public static final String CIRCLE = Circle.class.getSimpleName();
	public static final String SQUARE = Square.class.getSimpleName();
	public static final String RECTANGLE = Rectangle.class.getSimpleName();
	
	private Shape shape;
	
	public ShapeMaker() {}
	
	public ShapeMaker(String shape) {
		switch(shape) {
			case "Circle" : {
				this.shape = new Circle();
				break;
			}
			case "Square" : {
				this.shape = new Square();
				break;
			}
			default: {
				this.shape = new Rectangle();
			}
		}
	}

	public void drawCircle() {
		this.shape = new Circle();
		this.draw();
	}

	public void drawSquare() {
		this.shape = new Square();
		this.draw();
	}

	public void drawRectangle() {
		this.shape = new Rectangle();
		this.draw();
	}

	@Override
	public void draw() {
		this.shape.draw();
	}
	
	public void draw(String shape) {
		switch(shape) {
			case "Circle" : {
				new Circle().draw();
				break;
			}
			case "Square" : {
				new Square().draw();
				break;
			}
			default: {
				new Rectangle().draw();
			}
		}
	}
	

}
