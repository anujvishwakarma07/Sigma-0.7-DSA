// import java.util.Scanner;

public class Strings {
    public static void printString(String name){
        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "Anuj";
        // String str1 = new String("Rashmika");

        // //Strings are IMMUTABLE 

        // //How to input a String 
        // Scanner sc  = new Scanner(System.in);
        // String name ;
        // System.out.print("Enter your name : ");
        // // name  = sc.next();  // it takes only a word
        // name = sc.nextLine();

        // System.out.println("Your name is : "+name);
        // sc.close();
        
        // // //For accesing the length of the String :
        // String Full_name = "Rashmila Mandhana";
        // System.out.println(Full_name.length());

        // //Concatination : 
        // String first_name = "Nancy";
        // String last_name = "Momoland";
        // System.out.println(first_name+ " "+last_name);
        // System.out.println(first_name.concat(" "+last_name));

        // // For accesing the index character in String : 
        // String name = "Thong a yun";
        // System.out.println(name.charAt(4));
        // printString(name);



    }
}