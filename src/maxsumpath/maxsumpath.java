package maxsumpath;

import java.util.Arrays;
import java.util.Scanner;

public class maxsumpath {
    public static void main(String[] args) {
        int n,t=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt(); }
        t = sc.nextInt();
        int b[] =new int[t];
        for (int i=0;i<t;i++){
            b[i] = sc.nextInt(); }
        System.out.println(maxsum(a,n,b,t)); }
    static int max(int x,int y){
        return(x>y) ? x:y; }
    static int maxsum(int[] ara,int n,int[] arb,int t){
        int i=0,j=0,result=0,sum1=0,sum2=0;
        while (i<n&&j<t){
            if (ara[i]<arb[j]){
                sum1+=ara[i++]; }
            else if (ara[i]>arb[j]){
                sum2+=arb[j++]; }
            else {
                result += max(sum1,sum2)+ara[i];
                sum1=0;
                sum2=0;
                i++;
                j++; } }
        while (i<n){
            sum1 +=ara[i++]; }
        while (j<t){
            sum2 +=arb[j++]; }
        result +=max(sum1,sum2);
        return result; }}