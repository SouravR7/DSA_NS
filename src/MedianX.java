import java.util.*;
import java.io.*;
class MedianX{
    public static void main(String args[])throws IOException{

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            Integer num = 0, x = 0;
            String s = read.readLine();
            String st[] = s.trim().split("\\s+");
            num = Integer.parseInt(st[0]);
            x = Integer.parseInt(st[1]);

            Integer arr[] = new Integer[num];

            String str = read.readLine();
            String a[] = str.trim().split("\\s+");
            for(int i = 0; i < num; i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            minNumber(arr, x);

        }
    }
    static void minNumber(Integer[] a , Integer k){
        Arrays.sort(a);

        if(k<a[0] && k>a[a.length-1]) {
            System.out.println(a.length);
            return;
        }

        if(k.equals(a[0]) && k.equals(a[a.length-1])) {
            System.out.println(a.length-1);
            return;
        }

        int index = getAdequateIndex(a,k);
        if(k.equals(a[index])) {
            System.out.println(Math.abs(2*index+1-a.length));
            return;
        }

        int left = index+1;
        int right = a.length-left;

        if(left==right) {
            if(k.equals((a[index]+a[index+1])/2)) {
                System.out.println(0);
                return;
            }
            System.out.println(1);
            return;
        }

        if(left>right) {
            System.out.println(2*k-a[index]<=a[index+1] ? left-right:left-right+1);
        }
        else {
            System.out.println(2*k-a[index+1]>=a[index] ? right-left:right-left+1);
        }

    }

    private static int getAdequateIndex(Integer[] a,Integer k) {

        return mySearch(a, k, 0, a.length-1);
    }

    private static int mySearch(Integer[] a, Integer k, int i, int e) {

        if(i+1==e) {
            if(k.equals(a[e]))
                return e;
            else
                return i;
        }

        int mid = (i+e)/2;

        if(k.equals(a[mid]))
            return mid;

        if(k>a[mid])
            return mySearch(a, k, mid, e);
        else
            return mySearch(a, k, i, mid);

    }
}
