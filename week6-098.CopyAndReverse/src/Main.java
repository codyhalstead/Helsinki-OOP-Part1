
import java.util.Arrays;
public class Main {

 public static void main(String[] args) {
 }
 
 public static int[] copy(int[] array){
     int[] copiedArray= new int[array.length];
     for(int i=0; i<array.length; i++){
         copiedArray[i]=array[i];
     }
     return copiedArray;
 }
    
 public static int[] reverseCopy(int[] array){
     int[] copiedArray=new int[array.length];
     int j=array.length-1;
     for (int i=0; i<array.length; i++){
        copiedArray[i]=array[j];
        j--;
     }
     return copiedArray;
 }
}
