
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer number : list2) {
            if (!list1.contains(number)) {
                list1.add(number);
            }
    // public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            //int size = list2.size();

   // for (int i = 0; i < size; i++) {
      //  int thisNum = list2.get(i);
      //  if (list1.contains(thisNum)) {
        //do nothing
            // } else {
            //    list1.add(thisNum);
        }
    }
}
