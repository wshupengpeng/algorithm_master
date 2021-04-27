package com.basic.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *  记录快速排序：
 *     快排思想： 1 定义一个基准值
 *              2 一个指针从左到右遍历
 */
public class QuickSort {
   static Random random = new Random(100);
    public static void main(String[] args) {
        int [] arr= new int [15];
        init(arr);
        print(arr);
        quickSort(arr,0,arr.length-1);
        print(arr);

    }

    public static void quickSort(int []arr,int l,int r){
        if(l<r){
            int basic = arr[r];
            int i=l,j=r;
            while(i<j){
                while(i<j && arr[i]<=basic){
                    i++;
                }
                if(i<j) arr[j]=arr[i];
                while(j>i && arr[j]>basic){
                    j--;
                }
                if(j>i) arr[i] =arr[j];
            }
            arr[i] = basic;
            quickSort(arr,l,i-1);
            quickSort(arr,j+1,r);
        }
    }


    public static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void init(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
    }


}
