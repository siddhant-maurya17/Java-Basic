import java.util.HashMap;
import java.util.Scanner;

public class StringFreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(HashMap.Entry<Character,Integer> entry:hm.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
        sc.close();
    }
}