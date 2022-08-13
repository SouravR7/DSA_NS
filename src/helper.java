public class helper {
    public static void main(String[] args){
        int n = 45;
        boolean flag = true;
        for(long i=1; i <= Math.sqrt(n); i += 2){
            if(n % (i+1) == 0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("is Prime");
        }
        else{
            System.out.println("is not Prime");
        }
    }
}
