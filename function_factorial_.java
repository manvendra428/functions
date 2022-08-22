import java.util.*;

public class function_factorial_ {
    public static int factorial(int n){
        int fact =1;
        for(int i =n;i>=1;i--){
            fact = fact * i;
            
         } return fact;
    }
    public static void  main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        int answer = factorial(n);
        System.out.println(answer);
    
    }
    
}
