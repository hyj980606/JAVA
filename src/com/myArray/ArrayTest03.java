package com.myArray;

/**
 * @ClassName ArrayTest03
 * @Description 数组遍历（依次输出数组中的每一个元素）
 * @Author hyj
 * @Date 2022-07-17 20:17
 * @Version 1.0
 */

public class ArrayTest03 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {11,22,33,44,55};

        //原始做法
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------");*/

        //通过for循环实现获取数据0-4
        for (int x=0; x<5; x++){
            System.out.println(arr[x]);
        }
        System.out.println("--------------");

        //为了解决我们去数组中数元素的个数，数组就提供了一个属性：length
        //用于获取数组元素个数
        //格式：数组名.length
        System.out.println("数组共有："+arr.length+"个");
        System.out.println("-----------------------------");

        for (int x=0; x<arr.length; x++){
            System.out.println(arr[x]);
        }
    }
}
