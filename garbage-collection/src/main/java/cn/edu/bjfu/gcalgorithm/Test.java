package cn.edu.bjfu.gcalgorithm;

/**
 * @author chaos
 * @date 2021-11-30 21:25
 */
public class Test {

    public static Test obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        obj = this;
    }

    public static void main(String[] args) {
        obj = new Test();
        System.out.println(obj);
        obj = null;
        System.gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (obj == null) {
            System.out.println("obj d");
        } else {
            System.out.println(obj);
        }
    }

}
