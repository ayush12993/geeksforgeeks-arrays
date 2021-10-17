package subsequenceexist;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        int n,t=0,b=0,j=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        arraysub(a,n);
         }
    static void arraysub(int[] arr,int n){
            int i,max = n-1,min=0;
        int[] smaller= new int[n];
        smaller[0]=-1;
        for (i=1;i<n;i++){
            if (arr[i]<=arr[min]){
                    min=i;
                smaller[i]=-1;}
            else {
                smaller[i]=min;}}
        int[] greater= new int[n];
        greater[n-1]=-1;
        for (i=n-2;i>=0;i--){
            if (arr[i]>=arr[max]){
                max=i;
                greater[i]=-1;}
            else {
                greater[i]=max;}}
        for (i=0;i<n;i++){
            if (smaller[i] != -1 && greater[i] != -1){
                System.out.println(arr[smaller[i]]+" "+arr[i]+" "+arr[greater[i]]);
                return;
            }}
        System.out.println("0");
        return;
    }
}