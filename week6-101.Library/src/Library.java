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

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
    this.books=new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    
    public void printBooks(){
    for(Book i:books){
        System.out.println(i);
    }
    }
    
    public ArrayList<Book> searchByTitle(String searchedTitle){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i:books){
            if (StringUtils.included(i.title(), searchedTitle)){
                found.add(i);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found=new ArrayList<Book>();
        for(Book i:books){
            if(StringUtils.included(i.publisher(), publisher)){
                found.add(i);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found=new ArrayList<Book>();
        for(Book i:books){
            if(i.year()==year){
                found.add(i);
            }
        }
        return found;
    }
}