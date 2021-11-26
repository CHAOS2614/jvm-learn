package cn.edu.bjfu.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author chaos
 * @date 2021-11-26 18:34
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
    }
}
