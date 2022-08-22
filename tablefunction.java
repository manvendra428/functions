import java.util.*;
public class tablefunction {
    static int table(int num){
        int c = 1;
        for(int i = 1;i<= 10; i++){
            c = num*i;
            System.out.println(num + " * " + i  +  " = "  +  num*i );
        }return c;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
   int answer =  table(num);
  System.out.println(answer);
    }
}
