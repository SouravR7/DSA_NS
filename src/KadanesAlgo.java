import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        int sum = kadaneSolution(array);
        System.out.println(sum);
    }
    static int kadaneSolution(int[] array){
        int maxSubarraySum = 0,  globalSum = 0, uptoMax = Integer.MIN_VALUE, maxelement = array[0];
        for(int i=0; i<array.length; i++){
            uptoMax = Math.max(uptoMax,array[i]);
            maxSubarraySum = Math.max(array[i], (maxSubarraySum+array[i]));
            if(globalSum < maxSubarraySum){
                globalSum = maxSubarraySum;
                maxelement = uptoMax;
            }
        }
        return  globalSum - maxelement;
    }
}
