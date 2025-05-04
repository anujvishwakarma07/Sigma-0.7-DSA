public class linearSearch {
    public static void linear(int arr[]){
        int key = 34;
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("The index is : "+i);
                found = true;
                
            }
        }
        if(!found){
            System.out.println("The element is not avalible on this array");
        }
    }
    public static void main(String[] args) {
        int arr[] = {23, 34, 78, 10, 65, 98, 10, 44, 94};
        linear(arr);
    }
}
