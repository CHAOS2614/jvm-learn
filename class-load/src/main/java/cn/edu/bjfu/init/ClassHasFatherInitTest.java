package cn.edu.bjfu.init;

/**
 * @author chaos
 * @date 2021-11-26 16:30
 */
public class ClassHasFatherInitTest {

    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        // 先加载Father类，再加载Son类
        System.out.println(Son.B);
    }

}
