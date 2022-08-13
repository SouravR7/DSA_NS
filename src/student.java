import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] student = new String[size];
        int[] marks = new int[size];

        for(int i=0; i<size; i++){
            //student[i] = sc.next();
            marks[i] = sc.nextInt();
        }
        Map<Integer,Integer> mymap = new HashMap<Integer, Integer>();
       mymap = countStudent(marks,mymap);
       System.out.println(mymap);
    }

    static Map<Integer,Integer> countStudent(int[] marks, Map<Integer,Integer> mymap){

        for(int i=0; i<marks.length; i++){
            if(mymap.containsKey(marks[i])){
                int val = mymap.get(marks[i]);
                mymap.put(marks[i], val+1);
            }
            else {
                mymap.put(marks[i],1);
            }
        }
//        for(Map.Entry<Integer,Integer> myentry : mymap.entrySet()){
//            System.out.println(myentry);
//        }
        return mymap;
    }
}
