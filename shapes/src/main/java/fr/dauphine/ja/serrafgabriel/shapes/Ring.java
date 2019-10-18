package fr.dauphine.ja.serrafgabriel.shapes;

public class Ring extends Circle{
	
	private int rayonInterne;
	
	public Ring(Point p, int rayon, int rayonInterne) {
		super(p, rayon);
		this.rayonInterne = rayonInterne;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Ring ring = (Ring) obj;
		
	}*/
	
	

}
