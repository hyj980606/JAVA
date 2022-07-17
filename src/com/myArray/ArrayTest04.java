package com.myArray;

/**
 * @ClassName ArrayTest04
 * @Description 数组获取最值（获取数组中的最大值和最小值）
 * @Author hyj
 * @Date 2022-07-17 20:28
 * @Version 1.0
 */

public class ArrayTest04 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12,45,98,73,60};

        //定义参数
        int max = arr[0];

        //遍历数组，获取除了0索引以外的元素，进行比较
        for (int x=1; x<arr.length; x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        //输出最大值max
        System.out.println("max:"+max);
    }
}
