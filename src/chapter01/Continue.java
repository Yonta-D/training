package chapter01;

public class Continue {
    public static void main(String[] args) {
        /**
         * continue用于结束本次循环，继续执行下一次循环，即在本次循环内的continue后面的代码不再执行，直接进入下一次循环
         * 同样的，continue也可以使用label标签指明要跳转到哪一层循环
         */
        int i =1;
        while(i <=4){
            i++;
            if(i ==2){
                continue;
            }
            System.out.println("i="+i);//3,4,5
        }
    }
}
