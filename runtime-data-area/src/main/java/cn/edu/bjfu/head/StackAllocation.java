package cn.edu.bjfu.head;

/**
 * 栈上分配测试
 * <p>不开启逃逸分析,如果设置堆内存小点，会发生GC
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * <p>开启逃逸分析，堆内存小了也不会GC
 * -Xmx1G -Xms1G -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
 *
 * @author chaos
 * @date 2021-11-28 22:25
 */
public class StackAllocation {
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

    private static void alloc() {
        // 未发生逃逸
        User user = new User();
    }

    static class User {

    }
}
