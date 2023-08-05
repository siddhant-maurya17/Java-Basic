import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. to find the prime no. to the range: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
