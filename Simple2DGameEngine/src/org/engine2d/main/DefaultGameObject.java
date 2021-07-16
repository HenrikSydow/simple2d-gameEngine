package org.engine2d.main;

import java.awt.Graphics;

public abstract class DefaultGameObject {
	
	protected int x, y;
	
	public DefaultGameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void update();
	public abstract void render(Graphics g);
}
