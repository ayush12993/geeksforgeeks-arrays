package minimumdist;

import java.util.Scanner;

public class minimumdist {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        b=sc.nextInt();
        t=sc.nextInt();
        if (t<n && b<n){
        int min =a[t]-a[b];
            System.out.println(min);
    }
        else {
            System.out.println("-1");
        }
    }
}
