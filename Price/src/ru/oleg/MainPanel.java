package ru.oleg;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel{

	public MainPanel(){

		/*Не забывать изменять аргументы в settingMainPanelView()
		 * на количество добавляемых панелей*/
		
		settingMainPanelView(6);
		add(bGPanel("image/1pBaL.png","Выключатель","Переключатель","Выключатель + Радио","Диммер","Диммер + Радио"));
		add(bGPanel("image/2pBaL.png","Выключатель","Переключатель","Выключатель + Радио","Диммер","Диммер + Радио"));
		add(bGPanel("image/1pSaL.png","Выключатель","Переключатель","Выключатель + Радио","Диммер","Диммер + Радио"));
		add(bGPanel("image/2pSaL.png","Выключатель","Переключатель","Выключатель + Радио","Диммер","Диммер + Радио"));
		add(bGPanel("image/1pGaL.png","Выключатель","Переключатель","Выключатель + Радио"));
		add(bGPanel("image/2pGaL.png","Выключатель","Переключатель","Выключатель + Радио"));

	}
	
	private void settingMainPanelView(int component){
		
		setLayout(new GridLayout(component ,1));
	
	}
	
	private BackGroundPanel bGPanel(String setPathImageIcon, String cutout, String switchP, String radio){
		return new BackGroundPanel(setPathImageIcon, cutout, switchP, radio);
	}
	
	private BackGroundPanel bGPanel(String setPathImageIcon, String cutout, String switchP, String radio, String dimmer, String dimmerRadio){
		return new BackGroundPanel(setPathImageIcon, cutout, switchP, radio, dimmer, dimmerRadio);
	}


	
}
