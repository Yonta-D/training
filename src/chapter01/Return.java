package chapter01;

public class Return {
    public static void main(String[] args) {
        /**
         * return 表示跳出所在的方法，若return写在main方法内，则退出程序
         */
        for (int i = 1; i < 5; i++) {
            if (i ==3){
                System.out.println("===="+i);
                return;
            }
            System.out.println("222222222");
        }
        System.out.println("3333333");
    }
}
