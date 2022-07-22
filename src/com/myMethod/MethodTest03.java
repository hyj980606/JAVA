package com.myMethod;

/**
 * @ClassName MethodTest03
 * @Description 写一个方法：传递一个整数（大于1），在控制台打印到该数据的值
 * @Author hyj98
 * @Date 2022-07-22 10:48
 * @Version 1.0
 */

public class MethodTest03 {
    public static void main(String[] args) {
        //调用方法
        //printHumber(3);
        printHumber(10);
    }

    /*
    * 写一个方法，传递一个整数（大于1），在控制台打印1到该数据的值
    *
    * 两个明确：
    *       返回值类型：void
    *       参数列表：int n
    *
    * */
    public static void printHumber(int n){
        for (int x=1; x<=n; x++){
            System.out.println(x);
        }
    }


}
