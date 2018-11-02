public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times   
        while (amount>0){
            System.out.print("*");
            amount--;
        }System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count=sideSize;
        while (count>0){
            printStars(sideSize);
       
            count--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int count=height;
        while (count>0){
            printStars(width);
          
            count--;
        }
        
    }

    public static void printTriangle(int size) {
        // 39.4
        int count=size;
        int len=1;
        while (count>0){
            printStars(len);
            
            count--;
            len++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
