package sumofarray;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        int n,t=0,r=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n+1];
        for (int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=1;i<=n;i++){
        t=a[i]+r;
        r=t;}
        System.out.println("Sum is- "+t);
    }
}
