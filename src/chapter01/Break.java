package chapter01;

public class Break {
    public static void main(String[] args) {
        //break,随机生成1-100的一个数，直到生成97这个数，并计算用了多少次
        int i=0;
        boolean b = true;
        int j=0;
        int num1;
        while(b){
            int num =(int)(Math.random()*100)+1;
//            System.out.println(num);
            if(num == 97){
                b=false;
            }
            i++;
        }
        System.out.println("得到97共计算了"+i +"次。\n=============");
      /*  switch((int)(Math.random()*100)+1){
            case 97:
                i++;
                System.out.println("共使用了"+i+"次！");
                break;
            default:
                i++;
                break;
        }*/
        do {
            j++;
            num1 = (int)(Math.random()*100)+1 ;
            if(num1==97){
                System.out.println("得到97共计算了"+j +"次。");
                break;
            }
        }while(num1 != 97);

        /**
         * 标签不建议使用，会使代码可读性变差，不加label  break默认退出最近的循环
         * label1:{...}
         * label2:{...}
         * label3:{... break label2; ...}
         */
        label1:
        for (int k = 0; k < 3; k++) {
            label2:
            for (int l = 0; l < 2; l++) {
                if (l==1){
                    break label1;
                }
                System.out.println("l="+l);//0
            }
            System.out.println("k="+k);//走不到这了
        }

        //1-100以内的数求和，求当第一次大于20的当前数
        int total = 0;
        for(int currt=1;currt <=100;currt++){
            total += currt;
            if(total >20){
                System.out.println("当前数为："+currt);
                break;
            }
        }





    }
}
