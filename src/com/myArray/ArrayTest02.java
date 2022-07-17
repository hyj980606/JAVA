package com.myArray;

/**
 * @ClassName ArrayTest02
 * @Description 定义两个两个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
 *              然后给第二个数组赋值，再次输出两个数组的名及元素。
 * @Author hyj
 * @Date 2022-07-17 9:09
 * @Version 1.0
 */

public class ArrayTest02 {
    public static void main(String[] args) {
        //定义两个数组
        int[] arr1 = new int[2];
        int[] arr2 = new int[3];

        //分别输出数组名及元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        //然后分别给数组中的元素赋值
        arr1[1] = 100;

        arr2[0] = 200;
        arr2[2] = 300;

        //分别再次输出数组名及元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------------");



    }
}
