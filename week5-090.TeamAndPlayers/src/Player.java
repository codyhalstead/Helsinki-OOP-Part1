/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class Player {
    private String player;
    private int goals;


    public Player(String player){
        this.player=player;
        this.goals=0;}
    
    public Player(String player, int goals){
        this.player=player;
        this.goals=goals;
    }
    
    public String getName(){
        return this.player;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String toString(){
        return this.player+", goals "+this.goals;
    }

}

