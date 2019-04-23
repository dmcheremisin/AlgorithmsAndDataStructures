package com.algorythms.data.structures.sortAlgorithms;

public class Utils {
    public static void swap(int[] array, int i, int j) {
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
