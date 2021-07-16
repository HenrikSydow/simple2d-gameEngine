package org.engine2d.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable{

	public static Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int GAME_WIDTH = SCREENSIZE.width/2, GAME_HEIGHT = SCREENSIZE.height/2;
	public static final String GAME_NAME = "";
	
	private static KeyInput keyInput = new KeyInput();
	
	private Thread gameThread;
	
	private boolean running = false;

	public Game() {
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
		this.addKeyListener(keyInput);

		initGameFrame();
		start();
	}
	
	// sets up the JFrame containing the Game-Object:
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
	
	// Gameloop:
	public void run() {
		while (running) {
			update();
			repaint();
		}
	}
	
	// updates the game-object:
	private void update() {
		
	}
	
	// renders / paints when triggered by the repaint()-method:
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	// starts the gameloop:
	public void start() {
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	// stops the gameloop:
	public void stop() {
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Game();
	}

}
