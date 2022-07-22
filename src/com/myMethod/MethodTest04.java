package com.myMethod;

/**
 * @ClassName MethodTest04
 * @Description 写一个方法，把所有的水仙花数打印在控制台
 * @Author hyj
 * @Date 2022-07-22 10:55
 * @Version 1.0
 */

public class MethodTest04 {
    public static void main(String[] args) {
        printFlower();
    }

    /*
    * 写个方法
    * */
    public static void printFlower(){
        for (int x=100; x<999; x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;

            if ((ge*ge*ge+shi*shi*shi+bai*bai*bai)==x){
                System.out.println(x);
            }
        }
    }
}
