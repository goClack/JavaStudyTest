package java_imagej_test;

import ij.IJ;
import ij.ImagePlus;

import javax.swing.*;

import javax.imageio.ImageIO;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame{

	public DisplayImage() {
		// TODO Auto-generated constructor stub
		//initJFrame();
		
		
	};
	
	public void initJFrame()
	{
		setTitle("test JFrame");
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon testIcon = new ImageIcon("src/main/resources/gba_lba2.gif");
		
		JLabel testLabel;
		testLabel = new JLabel();
		testLabel.setIcon(testIcon);
		testLabel.setVisible(true);
		add(testLabel);
	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//ImagePlus imagePlus = IJ.openImage("CircusClownJackInTheBox.jpg");
		ImagePlus imagePlus = IJ.openImage("src/main/resources/CircusClownJackInTheBox.jpg");
		imagePlus.show();
		
		//new DisplayImage();
		
		File file = new File("src/main/resources/gba_lba2.gif");
        BufferedImage bufferedImage = ImageIO.read(file);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
		
		JFrame testFrame = new JFrame();
		testFrame.setLayout(new FlowLayout());
		testFrame.setSize(500, 500);
		JLabel testLabel = new JLabel();
		
		testLabel.setIcon(imageIcon);
		testFrame.add(testLabel);
		testFrame.setVisible(true);
		
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
