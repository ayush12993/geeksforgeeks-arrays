package majority;

import java.util.Scanner;

public class majorityelement {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        duplicate(a,n);
               }
    static void duplicate(int[] arr,int n){
        if (n==0 || n==1)
            System.out.println(arr[1]);;
        int j=0,i;
        for (i=1;i<n-1;i++){
            if (arr[i] == arr[i+1]) {
                System.out.println(arr[i]);
                break;
            }else {
                System.out.println(-1);
                break;
            }
        }

    }
}