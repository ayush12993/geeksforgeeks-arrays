package sameelementremoval;

import java.util.Arrays;
import java.util.Scanner;

public class samelementremoval {
    public static void main(String[] args) {
        int n,t=0,b,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        n=removeduplicate(a,n);
        for (int i=0;i<n;i++){
            System.out.println(a[i]);;
        }
    }
    static int removeduplicate(int[] arr,int n){
        if (n==0 || n==1)
            return n;
        int temp[] =new int[n];
        int j=0,i;
        for (i=0;i<n-1;i++){
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
                }}
                temp[j++] = arr[n-1];
                for (i=0;i<j;i++) {
                    arr[i] = temp[i];
                }
                return j;
    }}