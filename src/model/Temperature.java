package model;

public class Temperature {
    private double value;
    
    public Temperature(double value){
        this.value = value;
    }
    
    public void up(){
        value++;
    }
    
    public void down(){
        value--;
    }
    
    public String toString(){
        return value+" \u2103";
    }
}
