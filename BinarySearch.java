import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Arrays should be in sorted order:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Now please give target no to find the index no:");
            int target=sc.nextInt();
            
            int start=0;
            int end=n-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                   System.out.println(mid);
                   return;
                }
                else if(arr[start]<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            System.out.println("No target Found");
        }
    }
}
