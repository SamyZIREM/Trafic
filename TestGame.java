package test;

import gui.AcceuilGUI;


/**
 * 
 * 
 * @author Samy, Mélissa, Billel
 * Cette classe est une classe teste qui permet de lancer l'application
 */
public class TestGame {
	public static void main(String[] args) {

		AcceuilGUI gameMainGUI = new AcceuilGUI("Trafic");

		Thread gameThread = new Thread(gameMainGUI);
		gameThread.start();
	}
}
