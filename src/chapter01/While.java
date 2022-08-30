package chapter01;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        for(int i = 0 ; i<2;i++){
            for(int j =0;j<3;j++) {
                System.out.println("i=" + i + ",j=" + j);
            }
        }
        int score1 =0,score2=0,score3=0;
        double avg1 ,avg2,avg3;
        Scanner myScanner = new Scanner(System.in);
//        for(int i =1;i<=3;i++){
//            for (int j = 1; j <= 5; j++) {
//                System.out.println("请输入第"+i+"个班级的第"+j+"名同学的成绩：");
//                int score = myScanner.nextInt();
//                switch (i){
//                    case 1:
//                        score1 +=score;
//                        break;
//                    case 2:
//                        score2 +=score;
//                        break;
//                    case 3:
//                        score3 +=score;
//                }
//
//            }
//        }
//        avg1 = (double)score1/5;
//        avg2 = (double)score2/5;
//        avg3 = (double)score3/5;
//        double avg = (double)(score1+score2+score3)/15;
//        System.out.println("第一个班级平均分："+avg1);
//        System.out.println("第二个班级平均分："+avg2);
//        System.out.println("第三个班级平均分："+avg3);
//        System.out.println("总平均分："+avg);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j<10; j++) {
                if (i<=j){
                    System.out.println(i+"*"+j+"="+i*j);
                }
            }
        }
    }
    public class table{

    }
}
