package org.engine2d.main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {

	public static final int GAME_WIDTH = 500, GAME_HEIGHT = 500;
	public static final String GAME_NAME = "";

	public Game() {
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));

		initGameFrame();
	}
	
	private void initGameFrame() {
		JFrame gameFrame = new JFrame(GAME_NAME);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setUndecorated(true);
		gameFrame.add(this);
		gameFrame.pack();
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Game();
	}

}
