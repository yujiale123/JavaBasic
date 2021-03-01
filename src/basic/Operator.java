package basic;

import java.util.Scanner;

/**
 * 运算符:
 * 表示式是由运算符和操作数组成的
 * 运算符分为算数运算符
 * 赋值运算符
 * 关系运算符
 * 逻辑运算符
 * 条件运算符(三目运算符)
 * 位运算符
 */
public class Operator {
    public static void main(String[] args) {
        /** 可以通过使用字符与整数做算术运算，得出字符对应的数值是多少
         算术表达式中不同的基本数据类型的值的时候,整个表示式的数据类型都会自动提升
         等级顺序：byte,short,char --> int --> long --> float --> double
         ++x:先加后使用,x++:先使用后加
         --x:先减后使用,x--:先使用后减
         **/
        char ch1 = 'a';
        System.out.println(ch1 + 1); // 输出98，97 + 1 = 98

        char ch2 = 'A';
        System.out.println(ch2 + 1); // 输出66，65 + 1 = 66

        char ch3 = '0';
        System.out.println(ch3 + 1); // 输出49，48 + 1 = 49
        String ch4 = "a";
        String ch5 = "b";
        System.out.println(ch4 + "1");
        System.out.println(ch4 + ch1);

        /**
         * 数值拆分案例
         */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int ge = q % 10;
        int shi = q / 10 % 10;
        int bai = q / 100;
        System.out.println("整数" + q + "个位为:" + ge);
        System.out.println("整数" + q + "十位为:" + shi);
        System.out.println("整数" + q + "百位为:" + bai);

        /**
         * 赋值运算符
         * 分别有: =   +=  ==
         * =	赋值	a=10，将10赋值给变量a
         * +=	加后赋值	a+=b，将a+b的值给a
         * -=	减后赋值	a-=b，将a-b的值给a
         * *=	乘后赋值	a*=b，将a×b的值给a
         * /=	除后赋值	a/=b，将a÷b的商给a
         * %=	取余后赋值	a%=b，将a÷b的余数给a
         */
        short s = 10;
        s = (short) (s + 10); // 此行代码报出，因为运算中s提升为int类型，运算结果int赋值给short可能损失精度

        s += 10; // 此行代码没有问题，隐含了强制类型转换，相当于 s = (short) (s + 10);

        /**
         * 关系运算符
         *  == !=  >   =>  <=
         *
         *  ==	a==b，判断a和b的值是否相等，成立为true，不成立为false
         * !=	a!=b，判断a和b的值是否不相等，成立为true，不成立为false
         * >	a>b，判断a是否大于b，成立为true，不成立为false
         * >=	a>=b，判断a是否大于等于b，成立为true，不成立为false
         * <	a<b，判断a是否小于b，成立为true，不成立为false
         * <=	a<=b，判断a是否小于等于b，成立为true，不成立为false
         */

        int a = 10;
        int b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true

        // 关系运算的结果肯定是boolean类型，所以也可以将运算结果赋值给boolean类型的变量
        boolean flag = a > b;
        System.out.println(flag); // 输出false

        /**
         * 逻辑运算符
         * &   |   !
         * &	逻辑与	a&b，a和b都是true，结果为true，否则为false
         * |	逻辑或	a|b，a和b都是false，结果为false，否则为true
         * ^	逻辑异或	a^b，a和b结果不同为true，相同为false
         * !	逻辑非	!a，结果和a的结果正好相反
         */

        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

//& “与”，并且的关系，只要表达式中有一个值为false，结果即为false
        System.out.println((i > j) & (i > k)); //false & false,输出false
        System.out.println((i < j) & (i > k)); //true & false,输出false
        System.out.println((i > j) & (i < k)); //false & true,输出false
        System.out.println((i < j) & (i < k)); //true & true,输出true
        System.out.println("--------");

//| “或”，或者的关系，只要表达式中有一个值为true，结果即为true
        System.out.println((i > j) | (i > k)); //false | false,输出false
        System.out.println((i < j) | (i > k)); //true | false,输出true
        System.out.println((i > j) | (i < k)); //false | true,输出true
        System.out.println((i < j) | (i < k)); //true | true,输出true
        System.out.println("--------");

//^ “异或”，相同为false，不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false,输出false
        System.out.println((i < j) ^ (i > k)); //true ^ false,输出true
        System.out.println((i > j) ^ (i < k)); //false ^ true,输出true
        System.out.println((i < j) ^ (i < k)); //true ^ true,输出false
        System.out.println("--------");

//! “非”，取反
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false，,输出true


        /**
         * 条件运算符
         * 三元表达式
         * 关系表达式  ? 表示式1 :表示式2
         * 问号前面的位置是判断的条件，判断结果为boolean型，为true时调用表达式1，为false时调用表达式2。其逻辑为：如果条件表达式成立或者满足则执行表达式1，否则执行第二个。
         */

        int x = 20;
        int y = 30;
        int z = x > y ? x : y;// 判断 a>b 是否为真，如果为真取a的值，如果为假，取b的值
        System.out.println(z);


        //1：定义三个变量用于保存和尚的身高，单位为cm，这里仅仅体现数值即可。
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2：用三元运算符获取前两个和尚的较高身高值，并用临时身高变量保存起来。
        int tempHeight = height1 > height2 ? height1 : height2;
        //3：用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存。
        int maxHeight = tempHeight > height3 ? tempHeight : height3;
        //4：输出结果
        System.out.println("maxHeight:" + maxHeight);
    }


}
