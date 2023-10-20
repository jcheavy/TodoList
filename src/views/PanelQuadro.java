package views;

import java.awt.Graphics;

import javax.swing.JPanel;

import services.CaptureMouseEvent;

public class PanelQuadro extends JPanel {

	private static final long serialVersionUID = 1L;

	private CaptureMouseEvent mouseInputs;
	private int xDelta = 100;
	private int yDelta = 100;

	public PanelQuadro() {
		mouseInputs = new CaptureMouseEvent(this);
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}

	public void changeXDelta(int value) {
		this.xDelta += value;
		repaint();
	}

	public void changeYDelta(int value) {
		this.yDelta += value;
	}

	public void setRectPosition(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.fillRect(xDelta, yDelta, 200, 50);
		repaint();

	}

}
