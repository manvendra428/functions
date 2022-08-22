import java.util.*;
class findingpower{
  public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;
        
        for(int i=1;i<=b;i++){
           
            c = c*a;
        }System.out.println(c);
    }
}