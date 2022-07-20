package com.myMethod;

import java.util.Scanner;

/**
 * @ClassName MethodTest02
 * @Description
 * @Author hyj
 * @Date 2022-07-20 21:08
 * @Version 1.0
 */

public class MethodTest02 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner input = new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个数据：");
        int x = input.nextInt();

        System.out.println("请输入第二个数据：");
        int y = input.nextInt();

        //调用方法
        boolean b=compare(x, y);

        //输出结果
        System.out.println("b:"+b);
    }

    /*
    * 比较两个数是否相等
    *
    * 两个明确：
    *       返回值类型：boolean
    *       参数列表：int a,int b
    * */
    public static boolean compare(int a, int b){
        if (a==b){
            return true;
        }else {
            return false;
        }
    }
}
