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

public class Phonebook {
    private ArrayList<Person> people;

    public Phonebook(){
        this.people=new ArrayList<Person>();
}
    
    public void add(String name, String number){
        people.add(new Person(name,number));
    }
    
    public void printAll(){
        for(Person i:people){
            System.out.println(i);
        }
    }
    
    public String searchNumber(String name){
        for(Person i:people){
            if(i.getName().contains(name)){
                return i.getNumber();
            }
            }
        return "number not known";
        }
    }


