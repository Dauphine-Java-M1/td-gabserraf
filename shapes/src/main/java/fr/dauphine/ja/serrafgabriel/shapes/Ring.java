package fr.dauphine.ja.serrafgabriel.shapes;

public class Ring {
	
	private Circle outerCircle;
	private double innerRadius;
	
<<<<<<< HEAD
	public Ring(Point p, int radius, int innerRadius) {
		outerCircle = new Circle(p, radius);
		this.innerRadius = innerRadius;
=======
	public Ring(Point p, int rayon, int rayonInterne) {
                super(p, rayon);
                if(rayonInterne > rayon) throw new IllegalArgumentException("The intern radius is not valid ! ");
		this.rayonInterne = rayonInterne;
>>>>>>> 646324e5df556f0e6bed3e65294b8018615608d1
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Ring ring = (Ring) obj;
<<<<<<< HEAD
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
	 
	 
	
	
=======
                if(ring.rayonInterne == this.rayonInterne){
                    if(ring.getCenter() == this.getCenter()){
                        if(ring.getRadius() == this.getRadius()) return true;
                    }
                }
                return false;
		
	}
        
        @Override
        public String toString(){
            
            return super.toString() + "de rayon interne " + this.rayonInterne;
        }
        
	@Override
        public boolean contains(Point p){
            Circle circle = new Circle(this.getCenter(),rayonInterne);
            if(circle.contains(p)){
                return false;
            }else{
                if(super.contains(p)) return true;
            }
            return false;
        }
>>>>>>> 646324e5df556f0e6bed3e65294b8018615608d1
	
        public static boolean contains(Point p, Ring... rings){
            for(Ring ring : rings){
                if(ring != null && ring.contains(p)) return true;
            }
            return false;
        } 

}
