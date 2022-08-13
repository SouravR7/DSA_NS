import java.util.Scanner;

public class Cypher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CypherText(str);
        //System.out.println("hello");
    }
    static void CypherText(String str){
//        for(int i=0; i<str.length(); i++){
//                char ch = str.charAt(i);
//                if (Character.isLowerCase(ch)) {
//                    ch = (char) (122 - (int) (ch) + 97);
//                }
//                else if (Character.isUpperCase(ch)) {
//                    ch = (char)(90 - (int)(ch) + 65);
//                }
//                System.out.print(ch);
//        }
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            int asci = c;
            int z = 0;
            if(Character.isUpperCase(c)){
                z = (90-asci) +65;
            }
            else if (Character.isLowerCase(c)){
                z = (122 - asci) + 97;
            }
            else if(asci == 32){
                z = 32;
            }
            char last = ((char)z);
            System.out.print(last);
        }

    }

}
