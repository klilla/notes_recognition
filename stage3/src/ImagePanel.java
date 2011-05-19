/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 */
public class ImagePanel extends JPanel implements Observer {

	private Image image = null;

	public void setImg(Image image) {
		this.image = image;
		if (image != null) {
			Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
			setPreferredSize(size);
			setMaximumSize(size);
			setMaximumSize(size);
			setSize(size);
		}
	}

	public ImagePanel() {
            System.out.println("konst");
		setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

	public void update(Observable o, Object arg) {
		if (arg != null && arg instanceof Image && arg != image) {
			setImg((Image) arg);
		}
		repaint();
	}
}
