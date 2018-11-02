/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class Bird {
    private String name;
    private String lName;
    private int observed;
    
    public Bird(String name, String lname){
        this.name=name;
        this.lName=lname;
        this.observed=0;
    }
    
    public void observed(){
        this.observed++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLName(){
        return this.lName;
    }
    
    @Override
    public String toString(){
        return this.name+" ("+this.lName+"): "+this.observed+" observations";
    }
}
