package ru.oleg;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SelectSwitch extends JPanel{
	
	private ButtonGroup gr;
	
	private JRadioButton cutoutPrice;
	private JRadioButton switchPrice;
	private JRadioButton dimmerPrice;
	private JRadioButton dimmerRadioPrice;
	private JRadioButton radioPrice;
	private JCheckBox box1;
	private JCheckBox box2;
	
	public SelectSwitch(String cutout, String switchP, String radio) {
		
		selectSwitchView();
		
		cutoutPrice = setJRadioButton(cutout);
		switchPrice = setJRadioButton(switchP);
		radioPrice = setJRadioButton(radio);
		
		gr = new ButtonGroup();
		gr.add(cutoutPrice);
		gr.add(switchPrice);
		gr.add(radioPrice);
		
		box1 = setJCheckBox("Пульт-брелок");
		box2 = setJCheckBox("Пульт");
		
		add(cutoutPrice);
		add(switchPrice);
		add(radioPrice);
		add(box1);
		add(box2);
		
	}
	
	public SelectSwitch(String cutout, String switchP, String radio, String dimmer, String dimmerRadio) {
		
		selectSwitchView();
		
		cutoutPrice = setJRadioButton(cutout);
		switchPrice = setJRadioButton(switchP);
		dimmerPrice = setJRadioButton(dimmer);
		dimmerRadioPrice = setJRadioButton(dimmerRadio);
		radioPrice = setJRadioButton(radio);
		
		gr = new ButtonGroup();
		gr.add(cutoutPrice);
		gr.add(switchPrice);
		gr.add(radioPrice);
		gr.add(dimmerPrice);
		gr.add(dimmerRadioPrice);
		
		box1 = setJCheckBox("Пульт-брелок");
		box2 = setJCheckBox("Пульт");
		
		add(cutoutPrice);
		add(switchPrice);
		add(radioPrice);
		add(dimmerPrice);
		add(dimmerRadioPrice);
		add(box1);
		add(box2);
		
	}
	
	private void selectSwitchView(){
		
		setLayout(new GridLayout(7,1));
	
	}
	
	private static JRadioButton setJRadioButton(String name){
		return new JRadioButton(name);
	}
	
	private JCheckBox setJCheckBox(String name){
		return new JCheckBox(name);
	}
	
}
