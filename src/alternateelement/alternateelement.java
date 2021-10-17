package alternateelement;

import java.util.Scanner;

public class alternateelement {
    public static void main(String[] args) {
        int n,t=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       int a[] =new int[n+1];
       for (int i=1;i<=n;i++){
              a[i] = i;
              if (a[i]%2==1)
           System.out.println(a[i]);
       }

    }
}
