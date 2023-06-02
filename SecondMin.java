import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element you want to take: ");
        int n=sc.nextInt();
        System.out.println("Enter the array Element: ");
        int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int min1=Integer.MAX_VALUE;//1000
        int min2=Integer.MAX_VALUE;//1000
        for(int x:arr){
            if(x<min1){   //5 3 2 8 9
                min2=min1;//1000
                min1=x;//5
            }
            else if(x<min2 && min1!=min2){
                min2=x;//5
            }
        }
        System.out.print(min2);
    }
}
