package project.model;

public class Model {

	PuzzleSet set;
	Puzzle puzzle;
	
	public static Model defaultModel() {
		Model m = new Model();
		
		PuzzleSet set = StandardSet.produce();
		
		return m;
	}
}
