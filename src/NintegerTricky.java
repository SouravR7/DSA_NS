import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NintegerTricky {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] strArray = br.readLine().split(" ");
        int t = Integer.parseInt(br.readLine());
        long[] array = new long[size];
        for(int i=0; i<size; i++){
            array[i] = Long.parseLong(strArray[i]);
        }
        long[] prefixSum = SumPrefix(array,size);
        StringBuilder str = new StringBuilder();
        while(t-- > 0){
            String[] strArr = br.readLine().split(" ");
            int l = Integer.parseInt(strArr[0]);
            int h = Integer.parseInt(strArr[1]);
            str.append(CheckSum(prefixSum,l,h,prefixSum.length)).append("\n");
        }
        System.out.println(str);
    }

    static long[] SumPrefix(long[] array, int size){
        long[] prefixSum = new long[size];
        prefixSum[0] = array[0];
        for(int i=1; i<array.length; i++){
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        return prefixSum;
    }

    static long CheckSum(long[] prefixSum, int low, int high, int size){
        return ((prefixSum[size-1] - (prefixSum[high-1] - prefixSum[low - 2])) % 1000000007);
    }
}