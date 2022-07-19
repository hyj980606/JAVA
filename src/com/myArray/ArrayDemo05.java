package com.myArray;

/**
 * @ClassName ArrayDemo05
 * @Description 二维数组：其实就是元素为一维数组的数组
 *
 *              定义格式：
 *                  A：数组类型[][]数组名;（推荐方式）
 *                  B：数据类型 数组名[][];
 *                  C：数据类型[]数组名[];
 *              初始化：
 *                  A：动态初始化
 *                      数据类型[][]数组名 = new 数据类型[m][n];
 *                      m表示的是二维数组中一维数组的个数
 *                      n表示的是一维数组中的元素个数
 *                  B：静态初始化
 *                      数据类型[][]数组名 = new 数据类型[][]{{元素...},{元素...},{元素...},...}
 *                      简化格式：
 *                      数据类型[][]数组名 = {{元素...},{元素...},{元素...}...}
 *              二维数组名配合索引可以获取 每一个一维数组
 *              每一个一维数组配合索引名可以获取数组中的元素
 *
 * @Author hyj
 * @Date 2022-07-19 19:40
 * @Version 1.0
 */

public class ArrayDemo05 {
    public static void main(String[] args) {
        //数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //如何获取二维数组中的元素呢？
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);

    }
}





















