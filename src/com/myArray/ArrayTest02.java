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
        //定义一个数组
        int[] arr = new int[3];

        //赋值
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        //输出
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------------");

        //然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组，
        int[] arr2 = arr;

        //给第二个数组赋值
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;

        //再次输出两个数组的名级及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------------");

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
