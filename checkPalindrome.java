// package Sigma DSA.17 - Strings;
import java.util.*;

public class checkPalindrome {
    public static boolean isPalindrom(String a, int n){
        for(int i = 0; i < a.length()/2; i++){
            if(a.charAt(i) != a.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        a = sc.nextLine();
        int n = a.length();
        System.out.println(isPalindrom(a, n));
        sc.close();
       
    }
}
