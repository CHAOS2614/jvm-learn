package cn.edu.bjfu.init;

/**
 * @author chaos
 * @date 2021-11-26 16:25
 */
public class ClinitTest {

    // 如果没有需要初始化的类变量，则编译过后不会有<clinit>()方法

    private int a = 1;

    public static void main(String[] args) {
        int b = 2;
    }
}
