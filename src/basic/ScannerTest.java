package basic;

import java.util.Scanner;

/**
 * 键盘输入
 */
public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("请键盘输入数字:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);

    }
}
