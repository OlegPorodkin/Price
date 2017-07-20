package ru.oleg;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackGroundPanel extends JPanel{

	public BackGroundPanel(String setPathImageIcon, String cutout, String switchP, String radio){

		panelView();

		add(setButton(setPathImageIcon),
				new GridBagConstraints(0,0,1,1,1.0,1.0,
						GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(10,10,0,5),
						40,40)
		);

		add(setLabelPriceView(),
			new GridBagConstraints(0,1,1,1,1.0,1.0,
	        GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(2,10,0,5),
	        0,0)
		);

		add(setSelectSwitch(cutout, switchP, radio),
			new GridBagConstraints(1,0,1,1,1.0,1.0,
		    GridBagConstraints.NORTH,GridBagConstraints.VERTICAL, new Insets(5,10,5,5),
		    0,0)
		);

		add(addPriceLabel(cutout, switchP, radio),
				new GridBagConstraints(2,0,1,1,1.0,1.0,
						GridBagConstraints.NORTH,GridBagConstraints.VERTICAL, new Insets(5,10,5,5),
						40,40)
		);

	}

	public BackGroundPanel(String setPathImageIcon, String cutout, String switchP, String radio, String dimmer, String dimmerRadio){

		panelView();

		add(setButton(setPathImageIcon),
			new GridBagConstraints(0,0,1,1,1.0,1.0,
            GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(10,10,0,5),
            40,40)
		);

		add(setLabelPriceView(),
			new GridBagConstraints(0,1,1,1,1.0,1.0,
	        GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(2,10,0,5),
	        0,0)
		);

		add(setSelectSwitch(cutout, switchP, radio, dimmer, dimmerRadio),
			new GridBagConstraints(1,0,1,2,1.0,1.0,
		    GridBagConstraints.NORTH,GridBagConstraints.VERTICAL, new Insets(5,10,5,5),
		    0,0)
		);

		add(addPriceLabel(cutout, switchP, radio, dimmer, dimmerRadio),
				new GridBagConstraints(2,0,1,2,1.0,1.0,
						GridBagConstraints.NORTH,GridBagConstraints.VERTICAL, new Insets(5,10,5,5),
						40,40)
		);

	}

	private void panelView(){

		setSize(350, 350);
		setLayout(new GridBagLayout());

	}

	private ImageButton setButton(String setImageIcon){

		return new ImageButton(setImageIcon);

	}

	private JLabel setLabelPriceView(){

		return new JLabel("Цена!");

	}

	private SelectSwitch setSelectSwitch(String cutout, String switchP, String radio){

		return new SelectSwitch(cutout, switchP, radio);
	}

	private SelectSwitch setSelectSwitch(String cutout, String switchP, String radio, String dimmer, String dimmerRadio){

		return new SelectSwitch(cutout, switchP, radio, dimmer, dimmerRadio);
	}

	private PriceLabel addPriceLabel(String cutout, String switchP, String radio){

		return new PriceLabel(cutout,switchP,radio);

	}

	private PriceLabel addPriceLabel(String cutout, String switchP, String radio, String dimmer, String dimmerRadio){

		return new PriceLabel(cutout, switchP, radio, dimmer, dimmerRadio);

	}

}
