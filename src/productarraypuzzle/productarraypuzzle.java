package productarraypuzzle;

import java.util.Scanner;

public class productarraypuzzle {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        productarray(a,n);
    }
    static void productarray(int[] a, int n){
       if (n==1){
           System.out.println(0);
           return ;
       }
       int left[] = new int[n];
       int right[] = new int[n];
       int prod[] = new int[n];
       int i,j;
       right[n-1] = 1;
       for (i=1;i<n;i++)
           left[i] = a[i-1]*left[i-1];
       for (j=n-2;j>=0;j++)
           right[j] = a[j+1]*right[j+1];
       for (i=0;i<n;i++)
           prod[i] = left[i]*right[i];
       for (i=0;i<n;i++)
           System.out.println(prod[i]);
        return ;
    }
}
