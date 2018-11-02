/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
import java.util.ArrayList;

public class BirdDB {
    private ArrayList<Bird> birdz;
    
    public BirdDB(){
        birdz=new ArrayList<Bird>();
    }
    
    public void addBird(String name, String lname){
        this.birdz.add(new Bird(name,lname));
    }
    
    public void stats(){
        for(Bird i:birdz){
            System.out.println(i);
        }
    }
    
    public ArrayList<Bird> birds(){
        return this.birdz;
    }
    
   
}
