package ru.oleg;

import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame{
	
	public MainFrame (){
		settingFrame("Price");

		add(setScrollMainPain(setMainPanel()));
		add(setScrollMainPain(setShoppingList()));




	}
	
	private void settingFrame (String title){
		setTitle(title);
		setSize(1000,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));

		setVisible(true);
	}
	
	private MainPanel setMainPanel(){
		return new MainPanel();
	}

	private JTable setShoppingList(){
		return new JTable(new ShoppingListAbMod());
	}

	private JScrollPane setScrollMainPain(JComponent component){

		JScrollPane jsp = new JScrollPane(component);
		jsp.setPreferredSize(new Dimension(component.getSize()));
		jsp.setHorizontalScrollBar(null);

		return jsp;

	}

	private Component addComponentToFrame(Component component){
		return null;
	}

	public static void main(String[] args) {
		new MainFrame();
	}

}