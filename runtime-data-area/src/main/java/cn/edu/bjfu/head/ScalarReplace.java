package cn.edu.bjfu.head;

/**
 * 未开启标量替换
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails -XX:-EliminateAllocations
 *
 * @author chaos
 * @date 2021-11-28 22:56
 */
public class ScalarReplace {
    static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User user = new User();
        user.id = 5;
        user.name = "chaos";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000L; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start) + "ms");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
