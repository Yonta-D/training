package chapter01;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        /**
         * 需求：对一个有序数组进行二分查找{1,8,10,89,1000,1234},输入一个数看
         * 该数组是否包含此数，并求出下标，如果没有就提示没有这个数
         */
        int[] arr = {1,8,10,89,1000,1234};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查询的数字：");
        int num = sc.nextInt();
       //toDo 依次从数组中间开始比较，提高运算效率


    }
}
