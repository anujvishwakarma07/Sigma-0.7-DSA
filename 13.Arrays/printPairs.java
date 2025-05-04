public class printPairs {
    public static void pairs(int arr[]){
        int totalPairs = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")" +" ");
                totalPairs ++;
            }
            System.out.println();
            
        }
        System.out.println("Total Pairs : "+totalPairs);
    }
    public static void main(String[] args) {
        int arr[] = {23, 56, 64, 94, 90, 43, 66};
        pairs(arr);
    }
}
