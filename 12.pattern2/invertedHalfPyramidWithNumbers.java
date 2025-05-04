public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        inverted_half_pyramid_with_numbers(5);
    }
    public static void inverted_half_pyramid_with_numbers(int n){
        for(int i = 0; i < n; i++){
            for(int count = 1; count <= n - i; count++){
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
