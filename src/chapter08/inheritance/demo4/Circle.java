package chapter08.inheritance.demo4;

public class Circle extends Figure {

	protected int radius;

	public Circle() {
		super();
	}

	public Circle(int posX, int posY, boolean visible, int radius) {
		super(posX, posY, visible);
		this.radius = radius;
	}

	@Override
	public void move() {
		System.out.println("move circle");
	}
}
