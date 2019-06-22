package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,12,34,56};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Pozitia elementului "
                +binarySearch(arr,n));
        System.out.println(Arrays.binarySearch(arr,n));
    }

    private static int binarySearch(int[] arr,int n){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(n==arr[m]) return m;
            else if(n<arr[m]) r=m-1;
            else l=m+1;
        }
        return -(l+1);
    }
}
