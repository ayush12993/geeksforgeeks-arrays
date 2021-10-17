package leaderarray;

import java.util.Arrays;
import java.util.Scanner;

public class leaderarray {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(a[n-1]);
        int max = a[n-1];
        for (int i=n-2;i>=0;i--) {
            if (max<a[i]){
                max=a[i];
                System.out.println(max);
        }}

    }
}
