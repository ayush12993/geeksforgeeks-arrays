package possibletriangle;

import java.util.Scanner;

public class possibletriangle {
    public static void main(String[] args) {
        int t,i,j,k,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        int count = 0;
        for (t=0;t<n;t++){
            a[t] = sc.nextInt();
        }
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                for (k=j+1;k<n;k++){
                    if ((a[i]+a[j]>a[k])
                            &&(a[k]+a[j]>a[i])
                            &&(a[i]+a[k]>a[j])){
                      count++;
                    }else {
                        System.out.println("no");
                    }
                }
            }
        }
        System.out.println(count);
    }
}
