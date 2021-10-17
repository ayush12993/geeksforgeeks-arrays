package reversingarray;

import java.util.Arrays;
import java.util.Scanner;

public class reversingarray{
    public static void main(String[] args) {
        int i,n,t=0,r=0,d;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for (i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
        }
