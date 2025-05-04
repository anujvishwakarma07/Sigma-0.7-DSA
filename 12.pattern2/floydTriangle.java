public class floydTriangle {
    public static void main(String[] args) {
        floyed_trinangle(5);
    }
    public static void floyed_trinangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
