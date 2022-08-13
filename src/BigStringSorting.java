import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigStringSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] array = new String[size];
        for(int i=0;i<size; i++){
            array[i] = sc.next();
        }

        bigSort(array,size);
    }
    static void bigSort(String[] array,int size){
        Comparator<String> stcomparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        };

        Arrays.sort(array,stcomparator);

        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }
}
