/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.beans.Beans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class PaintImage extends Observable {

	private BufferedImage img = null;
	private Color lineKolorD = Color.BLACK;
	private Point previousPoint = null;
	private boolean drawing = false;
	private BufferedImage temp = null;
	private Paint paint = null;

        private Random mojRandom = new Random();

	public PaintImage() {
            if (!Beans.isDesignTime()) {

		}
	}

	public void drawTo(Point point) {
		if (img != null) {
			Graphics g = img.getGraphics();
			g.setColor(lineKolorD);
			if (previousPoint == null) {
				previousPoint = point;
			}
			g.drawLine(previousPoint.x, previousPoint.y, point.x, point.y);
			previousPoint = point;
			setChanged();
			notifyObservers(img);
		}
	}

	
	public boolean isDrawing() {
		return drawing;
	}

	public void setDrawing(boolean drawing) {
		this.drawing = drawing;
		if (drawing == false) {
			previousPoint = null;
			if (temp != null) {
				img = temp;
				temp = null;
				setChanged();
				notifyObservers(img);
			}
		}
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
            System.out.println("setuje");
		this.img = img;
		setChanged();
		notifyObservers(img);
	}

        public Random getMojRandom() {
            return mojRandom;
        }

        public void setMojRandom(Random mojRandom) {
            this.mojRandom = mojRandom;
        }
}
