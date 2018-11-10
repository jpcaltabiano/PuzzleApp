package project;

import project.model.Model;
import project.view.PuzzleApplication;

public class Main {

		public static void main (String[] args) {
			Model m = Model.defaultModel();
			
			PuzzleApplication app = new PuzzleApplication(m);
			
			app.setVisible(true);
		}
}
