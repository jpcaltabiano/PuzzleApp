package project.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.BorderLayout;

/*import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;*/
import javax.swing.JScrollPane;

import project.model.Model;

/**
 * GUI frame converted to be amenable to EBC requirements.
 */

public class PuzzleApplication extends JFrame {

	JPanel contentPane;
	
	/** Represents model for application domain. */
	Model model;

	/**
	 * Create the frame.
	 */
	public PuzzleApplication(Model m) {
		this.model = m;
		
		setTitle("Klotski Puzzle Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 750);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFile.add(mntmQuit);
		
		JMenuItem mntmResetPuzzle = new JMenuItem("Reset Puzzle");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFile.add(mntmResetPuzzle);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JScrollPane PuzzleView = new JScrollPane();
		contentPane.add(PuzzleView, BorderLayout.CENTER);
		
		/*
		JScrollPane tangramSetPane = new JScrollPane();

		JScrollPane solutionSetPane = new JScrollPane(); 

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tangramSetPane, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(solutionSetPane, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(solutionSetPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addComponent(tangramSetPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
					.addContainerGap())
		);*/
		contentPane.setLayout(new BorderLayout(0, 0));
	}
	
	// Only here for WindowBuilder
	PuzzleApplication() {
		this (Model.defaultModel());
	}
}
