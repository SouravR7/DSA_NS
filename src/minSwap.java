import java.util.Scanner;

public class minSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for(int i=0; i<size; i++){
            array1[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            array2[i] = sc.nextInt();
        }

        long count = calculateminSwap(array1,array2);
        System.out.println(count);
    }

    static long calculateminSwap(int[] array1, int[] array2){
        long swap = 0;
        for(int i=0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                for(int j=0; j<array2.length; j++){
                    if(array1[i] == array2[j]){
                        swapElement(array2,i,j);
                        swap++;
                    }
                }
            }
        }
        return swap;
    }
    static void swapElement(int[] array,int a, int b){
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
