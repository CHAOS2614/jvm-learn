package cn.edu.bjfu.jvmstack;

/**
 * @author chaos
 * @date 2021-11-26 22:47
 */
public class StackFrameTest {
    public void methodA() {
        System.out.println("methodA()开始执行。。。");
        methodB();
        System.out.println("methodA()执行结束。。。");
    }

    public int methodB() {
        System.out.println("methodB()开始执行。。。");
        int i = 10;
        int v = (int) methodC();
        System.out.println("methodB()即将结束。。。");
        return i + v;
    }

    public double methodC() {
        System.out.println("methodC()开始执行。。。");
        double j = 20D;
        System.out.println("methodC()即将结束。。。");
        return j;
    }

    public static void main(String[] args) {
        StackFrameTest stackTest = new StackFrameTest();
        stackTest.methodA();
    }
}
