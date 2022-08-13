import java.util.Scanner;

public class subarray {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int size_of_array1 = sc.nextInt();
            int size_of_array2 = sc.nextInt();
            int[] array1 = new int[size_of_array1];
            int[] array2 = new int[size_of_array2];

            for (int i=0; i<size_of_array1; i++){
                array1[i] = sc.nextInt();
            }
            for (int i=0; i<size_of_array2; i++){
                array2[i] = sc.nextInt();
            }

            int count = subArray(array1,array2, size_of_array2);

            System.out.println(count);
        }

        static int subArray(int[] array1, int[] array2, int n){
            int count = 0;
            int len1 = array1.length;
            int swap = n;

            for(int i=0; i<n; i++){
                if(array1[i] == array2[i]){
                    count++;
                }
            }
            if(count >= 1){
                swap = n - count;
            }
            //System.out.println(swap);
            for(int i = n; i < len1; i++){
                count = 0;
                int swap1 = n;
                int k = 0;
                for(int j = (i-(len1 - n)+1) ; j <= i; j++){

                    if(array1[j] == array2[k++]){
                        count++;
                    }
                    //k++;
                }
                if(count >= 1){
                    swap1 = n - count;
                }
                swap = Math.min(swap , swap1);
            }

            return swap;
        }
}
