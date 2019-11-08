package fr.dauphine.ja.serrafgabriel.shapes;

public class Ring {
	
	private Circle outerCircle;
	private double innerRadius;
	
	public Ring(Point p, int radius, int innerRadius) {
		outerCircle = new Circle(p, radius);
                if(innerRadius > radius) throw new IllegalArgumentException("The intern radius is not valid ! ");
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
	 

        public boolean contains(Point p){
            Circle circle = new Circle(this.outerCircle.getCenter(), this.innerRadius);
            if(circle.contains(p)){
                return false;
            }else{
                if(this.outerCircle.contains(p)) return true;
            }
            return false;
        }

	
        public static boolean contains(Point p, Ring... rings){
            for(Ring ring : rings){
                if(ring != null && ring.contains(p)) return true;
            }
            return false;
        } 

}
