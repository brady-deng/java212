package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner temp = new Scanner(System.in);
        String tempin = temp.nextLine();
        String[] tempnums = tempin.split(" ");
        int[] nums = new int[tempnums.length];
        for (int i = 0;i < tempnums.length;i++){
            nums[i] = Integer.parseInt(tempnums[i]);
        }
        quicksort(nums,0,nums.length-1);
        StringBuffer tempout = new StringBuffer();
        for(int item:nums){
            tempout.append(Integer.toString(item));
            tempout.append(" ");
        }
        System.out.println(tempout);

    }
    public static void quicksort(int[] arr,int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int i = low;
        int temp = arr[high];
        for (int j = low;j<high;j++){
            if (arr[j]<=temp){
                int tempitem = arr[i];
                arr[i] = arr[j];
                arr[j] = tempitem;
                i+=1;
            }
        }
        int tempitem = arr[i];
        arr[i] = arr[high];
        arr[high] = tempitem;
        return i;
    }

}
