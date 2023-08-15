import java.util.Scanner;

public class Switch {
    public static void main(Alpha[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two number: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter the operation: ");
            char ch=sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("Expression must be +,-,*,/ or both numbers are integer");
                    break;
            }
        }
    }
}
