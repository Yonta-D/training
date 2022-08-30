package chapter01;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        /**
         * 二维数组：以数组为元素的数组
         * 1.形式上：数据类型 [] []
         * 2.二维数组的每一个元素也是一个数组
         */
        int [][] arr = {{0,0,0},{1,1,1},{2,2,2},{3,3,3}};
        for (int i = 0; i < arr.length; i++) {
            //输出每一个基础元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
