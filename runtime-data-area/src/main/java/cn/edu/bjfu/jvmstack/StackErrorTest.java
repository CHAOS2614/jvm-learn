package cn.edu.bjfu.jvmstack;

/**
 * StackOverflowError
 * 递归的时候出现可能性比较大
 * 没加-Xss时时9817
 * 设置之后(-Xss256k)2235
 * @author chaos
 * @date 2021-11-26 22:31
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
