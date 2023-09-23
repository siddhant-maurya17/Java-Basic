import java.util.*;

public class SwitchVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char c=Character.toLowerCase(ch);
        switch(c){
            case 'a':
               System.out.print("It is Vowel");
            break;
            case 'e':
               System.out.print("It is Vowel");
            break;
            case 'i':
               System.out.print("It is Vowel");
            break;
            case 'o':
               System.out.print("It is Vowel");
            break;
            case 'u':
               System.out.print("It is Vowel");
            break;
            default:
               System.out.print("It is not a Vowel");
        }
        sc.close();
    }
}
