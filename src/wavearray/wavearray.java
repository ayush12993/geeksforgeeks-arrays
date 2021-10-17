package wavearray;

import java.util.Arrays;
import java.util.Scanner;

public class wavearray {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        wavear(a,n);
        for (int i:a){
            System.out.println(i);
        }
    }
    static void wavear(int[] arr,int n){
        Arrays.sort(arr);
      for (int i=0;i<n-1;i+=2){
          swap(arr,i,i+1);
      }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }
}
