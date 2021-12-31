package com.example.sortKind;

/**
 * 每轮找到最小的 放到最前面
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] sort={1,3,22,33,434,56,764343,23,32,54,65,32,56};

        int[] intss = selectionSortByWY(sort);
        for (int i = 0; i < intss.length; i++) {
            System.out.print(intss[i]+"  ");
        }
    }

    private static int[] selectionSortByWY(int[] ints) {
        int temp=0;
        for (int i = 0; i < ints.length -1; i++) {
            //把第一个数当成最小的
         int   min = i;
            for (int j = i + 1; j < ints.length ; j++){
                //把第一个数当成最小的 ，和后面的做比较
                if (ints[min] > ints[j])
                    //小的赋值给min
                    min = j;
            }
            //这个条件不用管 ，主要是为了交换位置
                    if ((min!=i)) {
                        temp=ints[i];
                        ints[i]=ints[min];
                        ints[min]=temp;
                    }






        }
        return ints;
    }


}







