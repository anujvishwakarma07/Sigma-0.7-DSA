public class invertedStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int line = 1; line <=n; line++){
            for(int star = n; star >=line; star--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
