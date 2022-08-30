package chapter01;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        /**
         * 使用方式：
         * 1.动态初始化，命名并分配空间
         * 数据类型 数组名 [] = new 数据类型 [数组长度]
         * 2.动态初始化，先命名，后分配空间
         * 数据类型 数组名 []; 数组名 = new 数据类型 [数组长度];
         * 3.静态初始化
         * 数据类型 [] 数组名 = {元素值，...,元素值 }
         */
        //ex1,创建一个数据类型为Int 长度为2的数组,以下两种写法是一样的，习惯用第二种
        int[] a = new int[2]; //int b [] = new int[2];
        //声明数组开辟空间
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+i+1+"个数值");
            Scanner myScanner = new Scanner(System.in);
            scores[i] =myScanner.nextDouble();
        }
        System.out.println("==");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        /**
         * 注意事项：
         * 1.数组是多个相同数据类型的数据的组合
         * 2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
         * 3.数组创建后，如果没有赋值，则有默认值，int short byte 为0，float double为0.0，char为\u0000,boolean为false,String为null
         * 4.使用数组的步骤。1.声明数组并开辟空间。2.给数组各个元素赋值。3.使用数组
         * 5.数组下标从0开始
         * 6.数组下标必须在指定范围内使用
         * 7.数组属于引用类型，数组型数据是对象
         */
        System.out.println(a[0]+"\t"+a[1]);

        /**
         * 创建一个char类型的数组存放A-Z，并使用for循环访问打印
         */
        char A= 'A';
        char arr_A[] = new char[26];
        for (int i = 0; i < arr_A.length; i++) {
            arr_A[i] = (char) (A+i);
            System.out.println(arr_A[i]);
        }
        /**
         * 求一个数组的最大值及其下标 {4,-1,9,10,23,3,45}
         */
        int arr1[]= {4,-1,9,10,23,3,45};
        int max=arr1[0];
        for (int i =0; i < arr1.length; i++) {
            //相邻两个数组的值比较后赋值给最大值
            if(max<=arr1[i]){
                max=arr1[i];
            }
        }
        //得到最大值后反着再求一次即可
        for(int i=0;i< arr1.length;i++){
            if(max == arr1[i]){
                System.out.println("数组{4,-1,9,10,23,3,45}的最大值对应的Index为"+i);

            }
        }
        System.out.println("数组{4,-1,9,10,23,3,45}的最大值为："+max);
    }
}
