public class hollowRhombus {
    public static void HollowRhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j <= n; j++){
                if( i == 1 || j == n || j == 1 || i == n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRhombus(5);
    }
}
