import java.util.*;

public class findingpowerbyusingfunction {
 
   public static int power(int num, int expo){
    int c = 1;
    for(int i = 1;i<=expo;i++){
    c = c*num;
    }
    return c;
    }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int expo = sc.nextInt();

power (num,expo) ;
int answer = power(num,expo);
{
 System.out.println("ans is " + answer);
 //System.out.println("ans is " + answer);

} return;
}
}