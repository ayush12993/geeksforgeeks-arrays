package maximumsubar;

import java.util.Scanner;

public class maximumsubar {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        maxsubarr(a,n);
    }
    static void maxsubarr(int[] arr,int n){
        int x,y=0,z=0;
        int []a,b;
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                for (x=0;x<i;x++){
                    int temp = y+arr[x];
                    y=temp;
                    System.out.println(y);
                }
                for (x=i+1;x<n;x++){
                    int temp1 = z+arr[x];
                    z=temp1;
                    System.out.println(z);
                }}}
    }}