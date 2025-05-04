// package assignment;

public class q2 {
    public static void printSum(int matrix[][]){
        int row = 1;
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++ ){
            sum += matrix[row][i];
        }
        System.out.println("The sum is : "+ sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 9},{11, 4, 3},{2, 2, 3}};
        printSum(matrix);
    }
}
