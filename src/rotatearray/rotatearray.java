package rotatearray;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        int n,t=0,b;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for (int q=0;q<t;q++){
          int temp=0;
        n = sc.nextInt();
        b= sc.nextInt();
        int a[] =new int[n];

        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        leftrotatebyone(a,b,n);
            System.out.println(Arrays.toString(a));
    }}
    static void leftrotatebyone(int[] arr,int d,int n){
        d=d%n;
        int temp,i,j,k;
        int g_c_d = gcd(d,n);
        for (i=0;i<g_c_d;i++){
            temp=arr[i];
            j=i;
            while (true){
                k=j+d;
                if (k>=n)
                    k=k-n;
                if (k==i)
                    break;
                    arr[j]=arr[k];
                    j=k;

                arr[j]=temp;
            }
        }
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}