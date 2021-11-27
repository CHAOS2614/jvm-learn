package cn.edu.bjfu.head;

/**
 * -Xms10m 起始大小
 * -Xmx10m 最大大小
 * @author chaos
 * @date 2021-11-27 21:00
 */
public class HeapDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
