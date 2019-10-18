package fr.dauphine.ja.serrafgabriel.shapes;


import java.util.LinkedList;

public class LigneBrisee {
	
	LinkedList<Point> listPoint;
	private int max;
	
	public LigneBrisee(int max) {
		listPoint = new LinkedList<>();
		this.max = max;
	}
	
	public void add(Point p) {
		if(this.listPoint.size() > this.max) {
			listPoint.add(p);
		}
		
		
	}
	
	public int pointCapacity() {
		return this.max;
	}
	
	public int nbPoints() {
		return this.listPoint.size();
	}
	
	public boolean contains(Point z) {
		for(Point tmp : this.listPoint) {
			if(tmp.equals(z)) return true;
		}
		return false;
	}
	
	
	public static void main( String[] args ) {
		LigneBrisee l = new LigneBrisee(10);
		Point p = null;
		Point p1 = new Point(1,2);
		l.add(null);
		System.out.println(l.contains(null));
		System.out.println(l);
		
		
	}
}
