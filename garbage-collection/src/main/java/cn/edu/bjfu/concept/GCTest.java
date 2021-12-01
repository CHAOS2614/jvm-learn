package cn.edu.bjfu.concept;

import sun.misc.GC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chaos
 * @date 2021-12-01 11:57
 */
public class GCTest {

    public void test1() {
        GCTest gcTest = new GCTest();
        System.gc();
    }

    public void test2() {
        GCTest gcTest = new GCTest();
        gcTest = null;
        System.gc();
    }

    public void test3() {
        {
            GCTest gcTest = new GCTest();
        }
        System.gc();
    }

    public void test4() {
        {
            GCTest gcTest = new GCTest();
        }
        int n = 1;
        System.gc();
    }

    public void test5() {
        test1();
        System.gc();
    }

}
