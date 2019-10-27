package fr.dauphine.ja.serrafgabriel.shapes;

public class Ring extends Circle{
	
	private int rayonInterne;
	
	public Ring(Point p, int rayon, int rayonInterne) {
                super(p, rayon);
                if(rayonInterne > rayon) throw new IllegalArgumentException("The intern radius is not valid ! ");
		this.rayonInterne = rayonInterne;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Ring ring = (Ring) obj;
                if(ring.rayonInterne == this.rayonInterne){
                    if(ring.getCenter() == this.getCenter()){
                        if(ring.getRay() == this.getRay()) return true;
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
	
        public static boolean contains(Point p, Ring... rings){
            for(Ring ring : rings){
                if(ring != null && ring.contains(p)) return true;
            }
            return false;
        } 

}
