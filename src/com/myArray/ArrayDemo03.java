package com.myArray;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ClassName ArrayDemo03
 * @Description 静态初始化的格式
 *                  数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3，...};
 *
 *                  举例：
 *                      int[] arr = new int[] {1,2,3};
 *
 *                  简化格式：
 *                      数据类型[] 数组名 = {元素1,元素2.元素3,...};
 *                      int[] arr = {1,2,3};
 * @Author hyj
 * @Date 2022-07-17 19:58
 * @Version 1.0
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义数组
        //int[] arr = new int[] {1,2,3};
        int[] arr = {1,2,3};

        //输出数组名和元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
