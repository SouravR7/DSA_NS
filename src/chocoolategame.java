
import java.io.*;
import java.util.*;

class chocoolategame {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int X = Integer.parseInt(line.split(" ")[0]);
        int Y = Integer.parseInt(line.split(" ")[1]);
        int A = Integer.parseInt(line.split(" ")[2]);
        int B = Integer.parseInt(line.split(" ")[3]);
        int C = Integer.parseInt(line.split(" ")[4]);
        int[] arr1 = new int[A];
        int[] arr2 = new int[B];
        int[] arr3 = new int[C];
        String Ar1 = br.readLine();
        String[] t1 = Ar1.split(" ");
        for(int i=0; i<A; i++){
            arr1[i] = Integer.parseInt(t1[i]);
        }
        Arrays.sort(arr1);
        String Ar2 = br.readLine();
        String[] t2 = Ar2.split(" ");
        for(int i=0; i<B; i++){
            arr2[i] = Integer.parseInt(t2[i]);
            //System.out.println(arr2[i]);
        }
        Arrays.sort(arr2);
        String Ar3 = br.readLine();
        String[] t3 = Ar3.split(" ");
        for(int i=0; i<C; i++){
            arr3[i] = Integer.parseInt(t3[i]);
            //System.out.println(arr3[i]);
        }
        Arrays.sort(arr3);

        long count1 = count_in_array(arr1,arr2,arr3, A ,B ,C,X,Y);
        System.out.println(count1);
    }
    static long count_in_array(int[] arr1, int[] arr2, int[] arr3, int n1, int n2 , int n3,int X, int Y){
        Queue<Integer> queue = new Queue<Integer>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        for(int i=0; i< arr3.length; i++){
            queue.add(arr3[i]);
        }
        int[] newarr = new int[n1+n2];
        newarr = checkGreaterElement(arr1,arr2,queue,n1,n2,X,Y);
        long count = sumarr(newarr);
        return count;
    }
    static int[] checkGreaterElement(int[] arr1, int[] arr2,Queue<Integer> queue, int n1, int n2, int X, int Y ){
        int i=0,j=0;
        int[] newarr = new int[X+Y];
        while(i < n1-1 && j < n2-1){
            if(arr1[i] < arr2[j] && arr1[i] < queue.peek()){
                arr1[i] = queue.poll();
                i++;
            }
            else if (arr2[i] < arr1[j] && arr2[i] < queue.peek()){
                arr2[j] = queue.poll();
                j++;
            }
            else{
                queue.poll();
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int len1 = arr1.length-1;
        int len2 = arr2.length-1;
        int k = 0;
        while(len1 >= arr1.length-X){
            newarr[k] = arr1[len1];
            k++;
            len1--;
        }
        while(len2 >= arr2.length-Y){
            newarr[k] = arr2[len2];
            k++;
            len2--;
        }
        return newarr;
    }

    static long sumarr(int[] newarr){
        long c = 0;
        for(int i=0; i<newarr.length; i++){
            c += newarr[i];
        }
        return c;
    }
}
