import java.util.Scanner;

public class StringRev{
public static String rev(String s){
    if(s.length()==0)return "";
    return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();

  System.out.print(rev(s));
  sc.close();
 }
}