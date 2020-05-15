package model;

public class Temperature {
    private double value;
    
    public Temperature( double t){
        value = t;
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
