package cn.edu.bjfu.jvmstack;

import java.util.Date;

/**
 * 局部变量作用域
 *
 * @author chaos
 * @date 2021-11-26 23:26
 */
public class LocalVariableTest {
    public static void main(String[] args) {

    }

    public static void test() {
        int i = 10;
        if (i > 10) {
            int j = 5;
            System.out.println(j);
        }
        // 局部变量表的长度只有2
        // k占用已经销毁了的j的槽位
        int k = 10;
        System.out.println(i);
    }

    public void test1() {
        // 实例方法的局部变量表index为0处有一个this变量
        // 类方法没有，所以类方法中不能this.
        Date date = new Date();
        String name = "chaos";
        String info = test2(date, name);
        System.out.println(date);
    }

    private String test2(Date date, String name) {
        return "hello";
    }
}
