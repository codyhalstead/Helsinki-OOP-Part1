
public class Apartment {
 
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
 
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
     
    public boolean larger(Apartment compared){
        return this.squareMeters>compared.squareMeters;
    }
     
    private int price(){
        return pricePerSquareMeter*squareMeters;
    }
     
    public int priceDifference(Apartment compared) {
        // Math.abs returns the absolute value
        return Math.abs(this.price()-compared.price());
    }
     
    public boolean moreExpensiveThan(Apartment compared){
        return this.price()>compared.price();
    }   
}
    

