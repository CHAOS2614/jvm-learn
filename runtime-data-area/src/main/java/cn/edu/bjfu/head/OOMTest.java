package cn.edu.bjfu.head;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author chaos
 * @date 2021-11-27 22:03
 */
public class OOMTest {

    public static void main(String[] args) {
        List<Picture> list = new ArrayList<>();
        while (true) {
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
