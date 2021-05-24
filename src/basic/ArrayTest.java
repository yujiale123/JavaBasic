package basic;

/**
 * 数组
 */
public class ArrayTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        System.out.println(a);

    }
}
