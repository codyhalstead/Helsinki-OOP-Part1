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

public class Team {
    private String teamName;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team(String teamName){
        this.teamName=teamName;
        this.members=new ArrayList<Player>();
        this.maxSize=16;
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void addPlayer(Player p){
        if(this.maxSize>members.size()){
            
        
        members.add(p);}
    }
    
    public void printPlayers(){
        for(Player i:members){
            System.out.println(i);
        }
    }
    
    public int size(){
        int count=0;
        for (Player i:members)
            count++;
        return count;
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    
    public int goals(){
        int sum=0;
        for(Player i:members){
            sum+=(i.goals());
        }
        return sum;
    }
    
}
