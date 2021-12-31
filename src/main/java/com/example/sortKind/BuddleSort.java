package com.example.sortKind;

/**
 * 每一轮 只比较相邻的，进行多轮比较
 */
public class BuddleSort {

    public static void main(String[] args) {
        int [] sort={1,3,22,33,434,56,764343,23,32,54,65,32,56};
        int[] ints = buddleSort(sort);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+ " ");
        }
    }

    private static int[] buddleSort(int[] ints) {
        int temp;
        //外层只需要循环4次就行了
        for (int i = 0; i <ints.length -1; i++) {
            for (int j = 0; j <ints.length-1-i ; j++) {
                //比较的是内层的比较,相邻小的放前面 然后往后比较
                if (ints[j]>ints[j+1]) {
                    temp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }
            }

        }
return ints;



    }

}
/* 返回结果：
1 3 22 23 32 32 33 54 56 56 65 434 764343
*/
