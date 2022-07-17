package com.myArray;

/**
 * @ClassName ArrayDemo04
 * @Description 两个常见小问题：
 *                  ArrayIndexOutOfException：数组索引越界异常
 *                      产生原因：我们访问了不存在的索引
 *
 *                  NullPointerException:空指针异常
 *                      产生原因：数组已经不在指向堆内存的数据了，你还是用数组名去访问元素
 * @Author hyj
 * @Date 2022-07-17 20:06
 * @Version 1.0
 */

public class ArrayDemo04 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3};

        //访问数组元素
        //System.out.println(arr[3]);

        //引用类型：类，接口，数组
        //常量：空常量，null，是可以复制给引用类型的
        arr = null;
        System.out.println(arr[1]);
    }
}
