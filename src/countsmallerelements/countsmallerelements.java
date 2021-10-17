package countsmallerelements;

import java.util.Arrays;
import java.util.Scanner;

public class countsmallerelements {
    public static void main(String[] args) {
        int n,t=0,b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[] =new int[n];

        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
            }
        b = sc.nextInt();
        Arrays.sort(a);
        for (int i=0;i<n;i++){
            if (b<=a[i]) {
             t=i;
            }
        }
        System.out.println(t);
        }

    }

