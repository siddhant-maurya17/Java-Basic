import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to find factorial");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
          fact*=i;
        }
        System.out.println(fact);
        sc.close();
    }
}
