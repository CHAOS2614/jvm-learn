package cn.edu.bjfu.init;

/**
 * @author chaos
 * @date 2021-11-26 15:55
 */
public class ClassInitTest {

    // 类变量准备阶段都会被赋零值，在类加载第三阶段-初始化阶段才会显示赋值，按照从上到下的顺序。

    private static int num = 101;

    static {
        num = 11;
        num2 = 12;
    }

    private static int num2 = 102;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.num2);
    }
}
