import java.util.*;
public class multiplybyfunction
 {
    public static int mul(int a,int b){
     int   mul = a*b;

    return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a " );
        int a =sc.nextInt();
        System.out.println("enter number b");
        int b =sc.nextInt();
       int ans = mul(a,b);
       System.out.println(ans);

 } 
    
}
