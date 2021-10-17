package minandmaxarray;

import java.util.Scanner;

public class minandmaxarray {
    public static void main(String[] args) {
        int max=0,min=0,n,t=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] =new int[n+1];

        for (int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        max = getMax(a);
        min = getMin(a);
        System.out.println(max+" "+min);

    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[1];
        for (int i=1;i<inputArray.length;i++){
            if (inputArray[i]>inputArray[i-1]){
                maxValue=inputArray[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[1];
        for (int i=1;i<inputArray.length;i++){
            if (inputArray[i]<inputArray[i-1]){
                minValue=inputArray[i];
            }
        }
        return minValue;
    }
}
