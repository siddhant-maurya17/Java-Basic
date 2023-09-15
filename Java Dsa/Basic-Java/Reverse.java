import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 12345 => 54321

        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=(sum*10)+digit;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
