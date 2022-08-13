import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhalphabeticalOOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] array = new String[size];
        for(int i=0;i<size; i++){
            array[i] = sc.next();
        }

        String reference = "eklpyqrbgjdwtcaxznsifvhmou";

        sortInOrder(array,reference);
    }

    static void sortInOrder(String[] array, String reference){
        Comparator<String> orderSort = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for(int i=0; i< Math.min(o1.length(),o2.length());i++){
                    if(reference.indexOf(o1.charAt(i)) == reference.indexOf(o2.charAt(i))){
                        continue;
                    }
                    else if(reference.indexOf(o1.charAt(i)) < reference.indexOf(o2.charAt(i))){
                        return -1;
                    }
                    else {
                        return 1;
                    }

                }
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(array,orderSort);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
