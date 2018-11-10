package project.model;

import java.util.*;

public class Puzzle {
	
	public static final int scale = 512;
	ArrayList<PuzzlePiece> pieces = new ArrayList<>();
	PuzzlePiece active;

	public Puzzle() {}
	
	public Optional<PuzzlePiece> getActive() {
		if (active == null) {
			return Optional.empty();
		}
		return Optional.of(active);
	}
	
	public void setActive(PuzzlePiece active) {
		this.active = active;
	}
	
	public Iterator<PuzzlePiece> getPieces() {
		return pieces.iterator();
	}
	
}
