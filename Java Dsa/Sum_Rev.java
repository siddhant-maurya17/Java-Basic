import java.util.Scanner;

public class Sum_Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
        System.out.print(rev);
        sc.close();
    }
}
