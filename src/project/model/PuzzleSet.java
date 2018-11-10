package project.model;

import java.util.*;

public class PuzzleSet implements Iterable<PuzzlePiece> {
	
	List<PuzzlePiece> pieces = new ArrayList<>();
	
	public void add(PuzzlePiece piece) {
		pieces.add(piece);
	}
	
	public Iterator<PuzzlePiece> iterator() {
		return pieces.iterator();
	}

	public int size() {
		return pieces.size();
	}
}
