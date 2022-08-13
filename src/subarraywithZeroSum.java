import java.util.HashMap;
import java.util.Scanner;

public class subarraywithZeroSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrsize = sc.nextInt();
        int[] array = new int[arrsize];
        for(int i=0; i<arrsize; i++){
            array[i] = sc.nextInt();
        }
        checkSubarraywithZerosum(array, arrsize);
    }

    static void checkSubarraywithZerosum(int[] array, int arrsize){
        boolean flag = false;
        int sum = 0;
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i=0; i<arrsize; i++){
            sum += array[i];

            if(sum == 0){
                flag = true;
            }
            else if(mymap.containsKey(sum)){
                int val = mymap.get(sum);
                flag = true;
                mymap.put(sum , val+1);
            }
            else {
                mymap.put(sum, 1);
            }
        }

        if(flag == true){
            System.out.println("Yes Exists");
        }
        else{
            System.out.println("No");
        }
    }
}
