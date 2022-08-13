import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        Map<Integer,Integer> mymap = new HashMap<>();
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j< array.length; j++){
                mymap.put(array[i],array[j]);
            }
        }

        System.out.println(mymap);
    }
}
