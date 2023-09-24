import java.util.*;
public class Armstrong {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arm=n;
    int sum=0;
    while(arm!=0){
        int digit=arm%10;
        sum=sum*10+digit;
        arm/=10;
    }
    if(sum==n){
        System.out.print(n+" is an armstrong number");
    }
    else{
        System.out.print("It is not an armstrong number");
    }
    sc.close();
   } 
}
