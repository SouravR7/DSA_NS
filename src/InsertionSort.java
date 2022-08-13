import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        insertionSort(array,size);
    }
    static void insertionSort(int[] array,int size){
        for(int i=1; i<size; i++){
            int key = array[i];
            int index = i-1;
            while(index >= 0 && array[index] > key){
                array[index+1] = array[index];
                index--;
                array[index+1] = key;

            }

        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
}
