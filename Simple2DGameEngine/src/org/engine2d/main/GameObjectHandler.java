package org.engine2d.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class GameObjectHandler {
	
	private LinkedList<DefaultGameObject> gameObjects = new LinkedList<DefaultGameObject>();
	
	private LinkedList<DefaultGameObject> gameObjectsToAdd = new LinkedList<DefaultGameObject>();
	private LinkedList<DefaultGameObject> gameObjectsToRemove = new LinkedList<DefaultGameObject>();
	
	
	public void update() {
		for(DefaultGameObject obj : gameObjectsToAdd)
			gameObjects.add(obj);
		gameObjectsToAdd.clear();
		
		for(DefaultGameObject obj : gameObjectsToRemove)
			gameObjects.remove(obj);
		gameObjectsToRemove.clear();
		
		for(DefaultGameObject obj : gameObjects)
			obj.update();
	}
	
	public void render(Graphics g) {
		for(DefaultGameObject obj : gameObjects)
			obj.render(g);
	}
	
	
	public void addDefaultGameObject(DefaultGameObject obj) {
		gameObjectsToAdd.add(obj);
	}
	
	public void removeDefaultGameObject(DefaultGameObject obj) {
		gameObjectsToRemove.add(obj);
	}
	
}
