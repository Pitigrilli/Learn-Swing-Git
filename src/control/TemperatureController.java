package control;

import gui.TemperatureView;
import model.Temperature;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TemperatureController implements ActionListener{
    
    Temperature temperature; 
    TemperatureView view;
    
    public TemperatureController(Temperature t){
        temperature=t;
    }
    
    public void addView(TemperatureView tv){
        this.view = tv;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals(" Up ")){
            temperature.up();
            view.update();
        }
        
        if(event.getActionCommand().equals("Down")){
            temperature.down();
            view.update();
        }
    }
    
    
}
