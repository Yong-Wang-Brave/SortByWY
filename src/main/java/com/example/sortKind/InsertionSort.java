package com.example.sortKind;
//核心思想：第二个数要是比第一个数小就交换位置
//参考：https://www.runoob.com/data-structures/insertion-sort.html
//https://www.cs.usfca.edu/~galles/visualization/
public class InsertionSort {
    public static void main(String[] args) {
        int [] sort={1,3,22,33,434,56,764343,23,32,54,65,32,56,23};

        int[] intss = insertionSortByWY(sort);
        for (int i = 0; i < intss.length; i++) {
            System.out.print(intss[i]+"  ");
        }
    }

    private static int[] insertionSortByWY(int[] ints) {
        int temp=0;
        for (int i = 0; i < ints.length -1; i++) {
            for (int j = i +1; j>0 ; j--){
                if (ints[j] > ints[j-1]){
                    temp=ints[j];
                    ints[j]=ints[j-1];
                    ints[j-1]=temp;
                }
            }
        }
        return ints;
    }


}







