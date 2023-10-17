import java.util.*;
public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        long sum=(long)n*((long)n+1)/2,s=0;
        for(int i=0;i<n-1;i++){
            s=s+arr[i];
        }
        System.out.println(sum-s);
    }
}
