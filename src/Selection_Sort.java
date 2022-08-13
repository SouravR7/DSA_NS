import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        selectionSort(array,size);
    }
    static void selectionSort(int[] array, int s){
        for(int i=0; i<s; i++){
            int imin = i;
            for(int j = i+1; j<s; j++){
                if(array[j] < array[imin]){
                    imin = j;
                }
            }
            swap(array,imin,i);
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    static int[] swap(int[] array, int imin, int i){
        int temp = array[i];
        array[i] = array[imin];
        array[imin] = temp;

        return array;
    }
}
