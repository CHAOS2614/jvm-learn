package cn.edu.bjfu.stringtable;

/**
 * @author chaos
 * @date 2021-11-30 19:03
 * <a href ="https://www.bilibili.com/video/BV1PJ411n7xZ?p=126&spm_id_from=pageDriver">链接</a>
 * new String("ab")会创建几个对象？
 * <p>
 * <p>
 * new String("a") + new String("b") 呢？
 */
public class StringNewTest {

    public static void main(String[] args) {
        String str = new String("ab");
        // new String("ab");
        String s = new String("a") + new String("b");


    }
}
