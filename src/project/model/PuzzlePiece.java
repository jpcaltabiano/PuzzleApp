package project.model;

import java.util.ArrayList;
import java.util.Iterator;
//import java.awt.Point;

public class PuzzlePiece implements Iterable<Coordinate>{
	
	ArrayList<Coordinate> poly = new ArrayList<>();
	public final int id;
	
	public PuzzlePiece(Coordinate[] points, int id) {
		for (Coordinate c : points) {
			poly.add(c);
		}
		
		poly.add(points[0]);
		this.id = id;
	}

	//public boolean contains(Point p) {}
	
	//public void translate(int x, int y) {}
	
	@Override
	public Iterator<Coordinate> iterator() {
		return poly.iterator();
	}
	
	public int size() {
		return poly.size();
	}
}
