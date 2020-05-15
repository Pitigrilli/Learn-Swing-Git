package gui;

import model.Temperature;
import control.TemperatureController;

import javax.swing.*;

public class TemperatureView extends JFrame {
    Temperature temperature;
    TemperatureController controller;
    
    JLabel lTemperature = new JLabel();
    JButton bUp = new JButton(" Up ");
    JButton bDown = new JButton("Down");
    
    public TemperatureView(Temperature t){
        super("Temperatur-Fenster");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.temperature = t;
        controller = new TemperatureController(temperature);
        controller.addView(this);
        
        lTemperature.setText(t.toString());
        add(lTemperature, java.awt.BorderLayout.NORTH);
        
        bUp.addActionListener(controller);
        add(bUp, java.awt.BorderLayout.WEST);
        
        bDown.addActionListener(controller);
        add(bDown, java.awt.BorderLayout.EAST);
                
        this.setVisible(true);
        pack();
    }
    
    public void update(){
        lTemperature.setText(temperature.toString());
    }
    
}
