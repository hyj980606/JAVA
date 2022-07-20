package com.myMethod;

/**
 * @ClassName MethodDemo01
 * @Description 方法定义及格式
 *                  简单的说：方法就是完成特定功能的代码块
 *                      -在很多语言里面都有函数的定义
 *                      -函数在Java中别成为方法
 *                  格式：
 *                      -修饰符返回值类型 方法名（参数类型 参数名1，参数类型 参数名2 ...）{
 *                          函数体;
 *                          return 返回值;
 *                      }
 *              方法格式解释说明
 *                  方法格式解释
 *                      -修饰符： 目前记住public static
 *                      -返回值类型： 用于限定返回值的数据类型
 *                      -方法名： 一个名字，为了方便我们调用方法
 *                      -参数类型：用于限定调用方法时传入的数据的类型
 *                      -参数名：用于接收调用方法时传入的数据的变量
 *                      -方法体：完成功能的代码
 *                      -return结束方法，把返回值带给调用者
 * @Author hyj
 * @Date 2022-07-20 19:45
 * @Version 1.0
 */

public class MethodDemo01 {
    public static void main(String[] args) {
        int d = sum(1,2);
        System.out.println(d);
    }

    /*
    * 两个明确：
    *       返回值类型：int
    *       参数列表：int a, int b
    * */
    public static int sum(int a,int b){
        int c = a+b;
        return c;
    }
}
