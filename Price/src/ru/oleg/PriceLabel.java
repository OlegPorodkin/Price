package ru.oleg;

import javax.swing.*;
import java.awt.*;

public class PriceLabel extends JPanel {

    Price price;

    public PriceLabel(String cutoutPrice, String radioPrice, String switchPrice) {

        priceLabelView();

        price = new Price();

        price.setCutoutPrice("1500");
        price.setSwitchPrice("2000");
        price.setRadioPrice("1900");

        price.setRemoteControllerTrinket("500");
        price.setRemoteController("1500");

        add(new JLabel(price.getCutoutPrice()));
        add(new JLabel(price.getRadioPrice()));
        add(new JLabel(price.getSwitchPrice()));

        add(new JLabel(price.getRemoteControllerTrinket()));
        add(new JLabel(price.getRemoteController()));

    }

    public PriceLabel(String cutoutPrice, String radioPrice, String switchPrice, String dimmerPrice, String dimmerRadioPrice) {

        priceLabelView();

        price = new Price();
        price.setCutoutPrice("1500");
        price.setSwitchPrice("2000");
        price.setRadioPrice("1900");
        price.setDimmerPrice("1500");
        price.setDimmerRadioPrice("2000");

        price.setRemoteControllerTrinket("500");
        price.setRemoteController("1500");

        add(new JLabel(price.getCutoutPrice()));
        add(new JLabel(price.getRadioPrice()));
        add(new JLabel(price.getSwitchPrice()));
        add(new JLabel(price.getDimmerPrice()));
        add(new JLabel(price.getDimmerRadioPrice()));

        add(new JLabel(price.getRemoteControllerTrinket()));
        add(new JLabel(price.getRemoteController()));

    }

    private void priceLabelView(){

        setLayout(new GridLayout(7,1));
        //setBackground(new Color(0xFF5E82));

    }

}
