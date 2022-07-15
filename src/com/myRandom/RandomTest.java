package com.myRandom;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName RandomTest
 * @Description 猜数字小游戏案例
 *                  系统产生一个1~100之间的随机数，请猜出这个数据是多少。
 *              分析：
 *                  A：系统产生一个1~100之间的随机数
 *                      Random r = new Random();
 *                      int number = r.nextInt(100) + 1;
 *                  B：键盘录入我们想要猜的数据
 *                  C：比较这两个数据用if语句实现
 *                      大了：提示大了
 *                      小了；提示小了
 *                      猜中了：提示恭喜你猜中了
 *                  D：多次猜数据而我们不知道猜多少次怎么办呢？
 *                      while（true）{
 *                          循环语句
 *                      }
 * @Author hyj
 * @Date 2022-07-15 8:59
 * @Version 1.0
 */

public class RandomTest {
    public static void main(String[] args) {
        //系统产生一个1~100之间的随机数
        Random r = new Random();
        //获取随机数
        int number = r.nextInt(100) + 1;

        //键盘录入我们猜测的数据


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入你猜的数字：");
            int num = input.nextInt();
            if (num > number) {
                System.out.println("猜大了");
            } else if (num < number) {
                System.out.println("猜小了");
            } else if (num == number) {
                System.out.println("恭喜你");
                break;
            }
        }
    }
}

















