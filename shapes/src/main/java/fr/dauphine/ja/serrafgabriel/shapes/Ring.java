package fr.dauphine.ja.serrafgabriel.shapes;

public class Ring {
	
	private Circle outerCircle;
	private double innerRadius;
	
	public Ring(Point p, int radius, int innerRadius) {
		outerCircle = new Circle(p, radius);
		this.innerRadius = innerRadius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Ring ring = (Ring) obj;
		if(this.innerRadius == ring.innerRadius) {
			if(this.outerCircle.getCenter().equals(ring.outerCircle.getCenter())) {
				if(this.outerCircle.getRadius() == ring.outerCircle.getRadius()) return true;
			}
		}
		return false;
		
	}
	
	 @Override
	 public String toString() {
		 return "Outer Circle : " + this.outerCircle.toString() + " Inner Radius : " + this.innerRadius;
	 } 
	 
	 
	
	
	

}
