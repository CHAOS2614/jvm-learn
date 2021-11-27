package cn.edu.bjfu.head;

/**
 * 启动时不加参数的话堆的默认大小：
 * 起始大小：电脑物理内存大小 / 64
 * 最大大小：电脑物理内存大小 / 4
 *
 * -Xms600m 起始大小
 * -Xmx600m 最大大小
 *
 * 开发中建议将初始堆内存和最大堆内存设置成相同值
 *
 * 查看设置参数：方式1：jps / jstat -gc 进程id
 *             方式2：启动参数-XX:+PrintGCDetails
 * @author chaos
 * @date 2021-11-27 21:39
 */
public class HeapSpaceInitial {

    public static void main(String[] args) {
        // 返回jvm中堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 返回jvm中试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms:" + initialMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");

        System.out.println("系统内存大小为:" + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存大小为:" + maxMemory * 4.0 / 1024 + "G");

//        try {
//            Thread.sleep(1000000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
