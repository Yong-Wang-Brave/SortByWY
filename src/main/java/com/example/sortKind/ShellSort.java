package com.example.sortKind;

/**
 * 分组进行插入排序
 * 8个数的话 a[0]与a[5]交换位置
 */
public class ShellSort {
    public static void main(String[] args) {
        int [] sort={1,3,22,33,434,56,764343,23,32,54,65,32,56,23};

        int[] intss = shellSortByWY(sort);
        for (int i = 0; i < intss.length; i++) {
            System.out.print(intss[i]+"  ");
        }
    }

    private static int[] shellSortByWY(int[] ints) {


        int temp=0;
        for (int step = ints.length/2; step>0; step/=2) {
            for (int i = step; i < ints.length; i++) {
                temp =ints[i];
                int j;
                for ( j= i-step ; j>=0&&ints[j]>temp; j-=step){

                    ints[j+step]=ints[j];

                }
                ints[j+step]=temp;
            }

        }
        return ints;
    }






}
