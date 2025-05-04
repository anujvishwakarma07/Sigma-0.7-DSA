public class InvertedRotatedHalfPyramid
{
    public static void RotatedHalfPyramid(int totalRow) {
       for(int i = 1; i <= totalRow; i++){
        for(int j = 1; j <= totalRow - i; j++){
            System.out.print(" "+" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
       }
       
    }
    public static void main(String[] args) {
        RotatedHalfPyramid(5);
    }
}
