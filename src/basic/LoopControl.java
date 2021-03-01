package basic;

import java.util.Scanner;

/**
 * 循环控制
 * 循环一般分为  顺序结构   分支结构(if-else  ,switch)  循环结构(for  do-while,while)
 */
public class LoopControl {
    public static void main(String[] args) {
        /**
         * 顺序结构
         * 顺序结构是程序中最简单最基本的流程控制，没有特定的语法结构，按照代码的先后顺序，依次执行，程序中大多数的代码都是这样执行的
         */

        /**
         * 分支结构
         *
         * if格式：
         * if (关系表达式) {
         *     语句体;
         * }
         */
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        int score = 65;
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else if (score >= 0 && score <= 59) {
            System.out.println("请努力加油");
        } else {
            System.out.println("成绩有误!");
        }

        /**
         * switch
         * switch (表达式) {
         * 	case 1:
         * 		语句体1;
         * 		break;
         * 	case 2:
         * 		语句体2;
         * 		break;
         * 	...
         * 	default:
         * 		语句体n+1;
         * 		break;
         * }
         *
         * 首先计算出表达式的值
         * 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结 束。
         * 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。
         */
        // 1. 键盘录入星期数据，使用变量接收
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int week = sc.nextInt();
        // 2. 多情况判断，采用switch语句实现
        switch (week) {
            // 3. 在不同的case中，输出对应的减肥计划
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("您的输入有误");
                break;
        }

        /**
         * for循环
         *
         * for(初始化语句;条件判断语句;条件控制语句){
         * 循环语句;
         * }
         * 格式解释：
         *
         * 初始化语句： 用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样
         * 条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去
         * 循环体语句： 用于表示循环反复执行的内容，简单说就是循环反复执行的事情
         * 条件控制语句：用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去
         * 执行流程：
         *
         * ①执行初始化语句
         *
         * ②执行条件判断语句，看其结果是true还是false
         *
         * ​ 如果是false，循环结束
         *
         * ​ 如果是true，继续执行
         *
         * ③执行循环体语句
         *
         * ④执行条件控制语句
         *
         * ⑤回到②继续
         */

        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                System.out.println("相等了");
            }
            System.out.println(i);
        }
        /**
         * 求1到100的总和
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        /**
         * 水仙花
         */
        for (int i = 0; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }

        /**
         * -每行打印2个水仙花数(统计)
         */
        // 1. 定义变量count，用于保存“打印过”的数量，初始值为0
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                //  2. 在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
                System.out.print(i + " ");
                count++;
                // 3. 在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }

        /**
         * while循环
         * 初始化语句;
         * while (条件判断语句) {
         * 	循环体语句;
         *     条件控制语句;
         * }
         *流程
         * ①执行初始化语句
         *
         * ②执行条件判断语句，看其结果是true还是false
         *
         * ​ 如果是false，循环结束
         *
         * ​ 如果是true，继续执行
         *
         * ③执行循环体语句
         *
         * ④执行条件控制语句
         *
         * ⑤回到②继续
         */

        int j = 5;
        while (j<=5){
            System.out.println("he");
            j++;
        }

        //定义一个计数器，初始值为0
        int count1 = 0;
        //定义纸张厚度
        double paper = 0.1;
        //定义珠穆朗玛峰的高度
        int zf = 8844430;
        //因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        //折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while(paper <= zf) {
            //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            paper *= 2;
            //在循环中执行累加，对应折叠了多少次
            count1++;
        }
        //打印计数器的值
        System.out.println("需要折叠：" + count1 + "次");

        /**
         * do{
         * }
         * while
         *
         * 初始化语句;
         * do {
         * 	循环体语句;
         * 	条件控制语句;
         * }while(条件判断语句);
         * 执行流程：
         *
         * ① 执行初始化语句
         *
         * ② 执行循环体语句
         *
         * ③ 执行条件控制语句
         *
         * ④ 执行条件判断语句，看其结果是true还是false
         *
         * 如果是false，循环结束
         *
         * 如果是true，继续执行
         *
         * ⑤ 回到②继续
         */

        /**
         * 三种循环的区别
         *
         * for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
         * do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）
         * for循环和while的区别
         * 条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
         * 条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用
         * 死循环（无限循环）的三种格式
         * for(;;){}
         * while(true){}
         * do {} while(true);
         */

    }
}
