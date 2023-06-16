import java.util.*;

public class Alpha{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        //Add Hi! to the string

        System.out.println("Hi!"+" "+s);//Concatination

        //skip the first character 

        System.out.println(s.substring(1));
        sc.close();
     }
}