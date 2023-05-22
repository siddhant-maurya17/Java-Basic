import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            /* Even or Odd */

            //Input from User --->
            int n=scanner.nextInt();

            if(n%2==0){
                System.out.println("No. is Even");
            }else{
                System.out.println("No. is Odd");                
            }
        }
    }
}
