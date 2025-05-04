import java.util.Scanner;
public class creationOf2DArray {
    public static boolean twoDarray(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j++){
               if(matrix[i][j] == key){
                System.out.println("The key element at this index : "+ "("+i+","+j+")");
                return true;
               }
            }
            
        }
        return false;
    }
    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        printMatrix(matrix);
        twoDarray(matrix, 3);

    }

}
