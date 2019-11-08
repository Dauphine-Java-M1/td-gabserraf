package fr.dauphine.ja.serrafgabriel.shapes;


public class Circle {
	
	private Point p;
	private double radius;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public Point getCenter() {
		return new Point(p.getX(),p.getY());
	}
        

	
	@Override
	public String toString() {

		return "Cercle de centre " + this.p.toString() + " et de rayon " + this.radius + "et de surface " +  this.surface();
	}
	
	public void translate(int dx, int dy) {
		Point tmp = new Point(p.getX(),p.getY());
		tmp.translate(dx, dy);
		this.p = tmp;
	}
	
	public double surface() {
		return this.radius* this.radius * Math.PI;
	}
	
	public boolean contains(Point p) {
		double distance = Math.sqrt((p.getX() - this.p.getX())*(p.getX() - this.p.getX()) + (p.getY() - this.p.getY())*(p.getY() - this.p.getY()));
		if(distance < this.radius) {
			return true;
		}
		return false;
	}
	

	

	
	public static boolean contains(Point p, Circle... circles) {
		for(Circle c : circles) {
			if(c!= null && c.contains(p)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Point p = new Point(1,2);
		Circle c = new Circle(p,1);
		
		Circle c2 = new Circle(p,2);
		c2.translate(1, 1);
		
		System.out.println(c + " " + c2);
		
		
		Circle c1 = new Circle(new Point(1,2),1);
		c1.getCenter().translate(1, 1);
		System.out.println(c1);
	}
}
