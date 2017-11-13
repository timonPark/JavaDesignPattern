package org.park.javadesignpattern.uday.command;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Drawable {
	// 그림 그리는 색
	private Color color = Color.red;
	// 그림 그리는 점의 변경
	private int radius = 6;
	// 이력
	private MacroCommand history;
	// 생성자
	 public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	 // 이력 전체를 다시 그리기
	 public void paint(Graphics g){
		 history.execute();
	 }
	
	 // 그림 그리기
	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius,  y-radius, radius*2, radius*2);
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	

}
