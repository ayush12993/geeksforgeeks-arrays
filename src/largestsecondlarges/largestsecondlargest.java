package largestsecondlarges;

import java.util.Arrays;
import java.util.Scanner;

public class largestsecondlargest {
    public static void main(String[] args) {
        int max=0,min=0,n,t=0,q=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n+1];

        for (int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }

        for (int i=1;i<=n;i++){
        Arrays.sort(a);
            t=a[i-1];
            q=a[i];
        }
        System.out.println("largest number- "+q+" second largest- "+t);
    }
}
