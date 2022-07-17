package com.myArray;

/**
 * @ClassName ArrayTest01
 * @Description 定义两个数数组名及元素。然后分别给数组中的元素赋值，分别再次输出数组名及元素。
 * @Author hyj
 * @Date 2022-07-17 8:59
 * @Version 1.0
 */

public class ArrayTest01 {
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

        System.out.println(arr1);
        System.out.println(arr1[0]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }
}
