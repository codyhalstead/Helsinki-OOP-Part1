/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit=upperLimit;
        
    }
    public void next(){
        value++;
        if (value>upperLimit){
            value=0;
        }
    }
    public String toString(){
        if(value>9){
            return ""+this.value;}
        else{
            return "0"+this.value;
                    
                    }
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int newValue) {
        if (newValue > 0 && newValue <= this.upperLimit) {
            this.value = newValue;}
}
}