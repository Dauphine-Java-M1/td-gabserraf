package fr.dauphine.ja.serrafgabriel.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(0, 0, this.getHeight(), 0);
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
}
