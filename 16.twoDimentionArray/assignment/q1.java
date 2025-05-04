// package assignment;
public class q1 {
    public static void frequencyCount(int matrix[][]){
        int key = 7;
        int frequency = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    frequency += 1;
                }
            }
        }
        System.out.println("The frequency of key is : "+frequency);
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},{8, 8, 7}};
        frequencyCount(matrix);
    }
}
