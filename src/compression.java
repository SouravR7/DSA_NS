import java.util.*;

public class compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        toMakeFrequencyList(strArray); // Make the String Array to a list of String with its frequency using Hashmap
    }

    static void toMakeFrequencyList(String[] strArray) {
        Map<String, Integer> mymap = new HashMap<String, Integer>();

        for (int i = 0; i < strArray.length; i++) {
            if (mymap.containsKey(strArray[i])) {
                int val = mymap.get(strArray[i]);
                mymap.replace(strArray[i], val + 1);
            } else {
                mymap.put(strArray[i], 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(mymap.entrySet());
        list = sortList(list); // Sort the list according to its frequency

        convertIndexToBinary(list);

    }


    static List sortList( List<Map.Entry<String, Integer>> list ) {
        Comparator<Map.Entry<String, Integer>> valComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        };
        Collections.sort(list, valComparator);
        return list;
    }


    static void convertIndexToBinary(List<Map.Entry<String, Integer>> list){ // Strings with its corresponding binary value for compresson
        Map<String,String> sortedMap = new TreeMap<String, String>();
        int index = 0;
        for(Map.Entry<String,Integer> entry : list){
            if(sortedMap.containsKey(entry.getKey())){
                continue;
            }
            else{

                sortedMap.put(entry.getKey(), Integer.toBinaryString(index));
            }
            ++index;
        }
        for(Map.Entry<String,String> entry1 : sortedMap.entrySet()){
            System.out.println(entry1.getKey()+" : "+entry1.getValue());
        }
    }
}
