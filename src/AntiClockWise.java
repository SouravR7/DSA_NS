import java.util.Scanner;

public class AntiClockWise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] mat = new int[t][t];
        for(int i=0; i<t; i++){
            for(int j=0; j<t; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        AntiClockArray(mat , t);
    }
    static void AntiClockArray(int[][] mat, int row){
        int col = row;
        int iteratingRow = 0, iteratingCol = 0;
        int count = 0 , total = row * col;

        StringBuilder answer = new StringBuilder("");
        while(iteratingRow < col && iteratingCol < row){
            if(count == total ){
                break;
            }
            for(int i=iteratingCol; i<col; i++){
                answer.append(mat[i][iteratingRow]+" ");
                count++;
            }
            iteratingRow++;
            if(count == total ){
                break;
            }
            for(int i=iteratingRow; i<row; i++ ){
                answer.append(mat[col-1][i]+" ");
                count++;
            }
            row--;
            if(count == total ){
                break;
            }
            if(iteratingCol < row){
                for(int i= row-1; i>=iteratingCol; i--){
                    answer.append(mat[i][col-1]+" ");
                    count++;
                }
            }
            col--;
            if(count == total){
                break;
            }
            if(iteratingRow < col){
                for(int i=col-1; i>=iteratingRow; i--){
                    answer.append((mat[iteratingCol][i]+" "));
                    count++;
                }
            }
            iteratingCol++;
        }
        System.out.println(answer);
    }
}
