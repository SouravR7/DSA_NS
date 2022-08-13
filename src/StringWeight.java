import java.util.*;
import java.io.*;
public class StringWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenString = sc.nextLine();
        int[] weightArray = {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        int result = calculateWeight(givenString, weightArray);
        System.out.println(result);
    }

    static int calculateWeight(String str, int[] weightArray){
        int a = 97;
        Map<Character, Integer> myMap = new HashMap<>();
        for(int i=0; i<weightArray.length; i++){
            myMap.put((char)a++,weightArray[i]);
        }

        String newStr = str.toLowerCase();
        int sum = 0;
        int weight = 1;
        for(int i=0; i<newStr.length(); i++){
        if(myMap.containsKey(newStr.charAt(i))){
            sum = sum + myMap.get(newStr.charAt(i));
        }else{
            weight = sum * weight;
            sum = 0;

        }
        }
        if(sum != 0){
            weight = sum * weight;
        }

        return weight;
    }
}
