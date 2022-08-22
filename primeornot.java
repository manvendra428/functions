import java.util.*;

 class primeornot {
    public static boolean prime(int num){
        boolean isprime = true; 
        for(int i = 2;i < num;i++){
            if(num%i==0){
            isprime = false;
            break;
        }
        } return isprime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to cheq");
        
        int num = sc.nextInt();
          boolean answer =  prime(num);
          if(answer == false)
          {System.out.println("no is not prime");}
          else
         {System.out.println("no is prime");}
    }
    
}
