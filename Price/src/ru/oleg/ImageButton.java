package ru.oleg;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class ImageButton extends JLabel{
	
	public int x=150;
	public int y=150;
	
	public ImageButton(String setImagePath) {
		 
		 setIconButton(setImagePath);
		 addMouseListener(new MauseEvent());
	  
	 }
	
	public void setIconButton(String setImagePath){
		
		ImageIcon icon1 = createIcon(setImagePath);
		setIcon(new ImageIcon(icon1.getImage().getScaledInstance(x, y, icon1.getImage().SCALE_DEFAULT)));
		
		
	}
	
	private ImageIcon createIcon(String path) {
        URL imgURL = ImageButton.class.getResource(path);     
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
	
}

class MauseEvent implements MouseInputListener
{

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("кликнул");
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println(arg0.getSource());
		
		System.out.println("входит");
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("выходит");
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Нажал");
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Отпустил");
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}