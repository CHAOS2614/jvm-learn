package cn.edu.bjfu.jvmstack;

/**
 * @author chaos
 * @date 2021-11-26 22:09
 */
public class JvmStackTest {

    public void methodA(){
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB(){
        int k = 30;
        int m =40;
    }

    public static void main(String[] args) {
        JvmStackTest stackTest = new JvmStackTest();
        stackTest.methodA();
    }
}
