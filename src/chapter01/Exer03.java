package chapter01;

public class Exer03 {
    public static void main(String[] args) {
        /**
         * 输出1-100之前不能被5整除的数，每5个一行
         */
        int retu = 0;
        for (int i = 1; i < 101; i++) {
            if(i%5!=0){
                System.out.print(i+"\t");
                retu++;
            }
            if (retu%5==0){
                System.out.println();
            }
        }
        /**
         * 输出小写的a-z以及大写的Z-A
         * 定义字符a,z，递增依次输出
         * 定义字符Z,A，依次递减输出
         */
        char a = 'a';
        char z = 'z';
        char Z = 'Z';
        char A = 'A';
        for (;a<=z;a++){
            System.out.println(a);
        }
        for (;Z>=A;Z--){
            System.out.println(Z);
        }
        /**
         * 求出 1-1/2 +1/3-1/4.。。。。。1/100的和
         */
        double sum = 1;
        for (double i = 1; i <100; i++) {
            if(i%2!=0){
                sum -= 1/(i+1);
            }else{
                sum +=1/(i+1);
            }
        }
        System.out.println("1-1/2 +1/3-1/4.。。。。。1/100的和="+sum);

        /**
         * 求 1+ （1+2）+ （1+2+3） + 。。。+（1+2+3+。。。+100）的结果
         * 100个1,99个2,98个3.。。1个100相加
         */
        int total = 0;
        int start = 100;
        for(;start>0;start--){
            total += start*(101-start);
        }
        System.out.println("1+ （1+2）+ （1+2+3） + 。。。+（1+2+3+。。。+100）的结果为"+total);

    }
}
