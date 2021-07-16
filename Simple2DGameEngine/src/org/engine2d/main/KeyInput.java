package org.engine2d.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox.KeySelectionManager;

public class KeyInput implements KeyListener{

	private boolean 
			w = false,
			a = false,
			s = false,
			d = false;
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			w = true;
			break;
		case KeyEvent.VK_A:
			a = true;
			break;
		case KeyEvent.VK_S:
			s = true;
			break;
		case KeyEvent.VK_D:
			d = true;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			w = false;
			break;
		case KeyEvent.VK_A:
			a = false;
			break;
		case KeyEvent.VK_S:
			s = false;
			break;
		case KeyEvent.VK_D:
			d = false;
			break;
		}
	}

}
