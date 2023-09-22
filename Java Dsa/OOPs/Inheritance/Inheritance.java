package Inheritance;
import java.util.*;
class Parent{
    int sum(int a,int b){
    return a+b;
    }
}
class Child extends Parent{
     int sum(int a,int b){
      return(a-b);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Parent obj1=new Parent();
        Child obj2=new Child();
        int result1=obj1.sum(5, 0);
        int result2=obj2.sum(4,7);
        System.out.print(result1+" "+result2);
        
        sc.close();
    }
}