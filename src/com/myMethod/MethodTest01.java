package com.myMethod;

import java.util.Scanner;

/**
 * @ClassName MethodTest01
 * @Description TODO
 * @Author hyj98
 * @Date 2022-07-20 20:59
 * @Version 1.0
 */

public class MethodTest01 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner input = new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个数据：");
        int a = input.nextInt();

        System.out.println("请输入第二个数据：");
        int b = input.nextInt();

        //调用方法
        int max = getMax(a,b);

        //输出结果
        System.out.println("max:"+max);
    }


    /*
    * 返回两个数中的最大值
    *
    * 两个明确:
    *       返回值类型：int
    *       参数列表：int a,int b;
    * */
    public static int getMax(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
