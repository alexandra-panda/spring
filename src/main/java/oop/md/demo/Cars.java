package oop.md.demo;

import java.util.List;

public class Cars {
    public List<String> cars;
    private double car_id;
    private String numele;
    private String producatorul;
    private int pretul;

    public Cars(double cars_id, String numele, String producatorul, int pretul) {
        this.car_id=car_id;
        this.numele= this.numele;
        this.producatorul= this.producatorul;
        this.pretul= this.pretul;
    }

    public double getCar_id() {
        return car_id;
    }
    public void setCar_id(double car_id){
        this.car_id=car_id;
    }
    public String getNumele() {
        return numele;
    }
    public void setNumele(String numele){
        this.numele=numele;
    }
    public String getProducatorul(){
        return producatorul;
    }
    public void setProducatorul(String producatorul) {
        this.producatorul = producatorul;
    }
    public int getPretul() {
        return pretul;
    }
    public void setPretul(int pretul){
        this.pretul=pretul;
    }
}
