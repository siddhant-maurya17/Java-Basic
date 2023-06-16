import java.util.Scanner;
public class Name {
    public static void main(Alpha args[]){
        try (Scanner sc = new Scanner(System.in)) {
            
           
            System.out.print("Enter First No: ");
            int a=sc.nextInt();
            System.out.print("Enter Second No: ");
            int b=sc.nextInt();

            System.out.print("Sum of two number is:");
            System.out.print(a+b);
        }
        
    }
    
}
