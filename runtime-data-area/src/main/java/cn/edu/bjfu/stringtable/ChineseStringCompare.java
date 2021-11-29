package cn.edu.bjfu.stringtable;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author chaos
 * @date 2021-11-29 22:50
 */
public class ChineseStringCompare {

    public static void chineseSort(List<String> list) {
        list.sort(Collator.getInstance(Locale.CHINA));
    }

    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<>();
        cityNames.add("北京");
        cityNames.add("上海");
        cityNames.add("浙江");
        cityNames.add("广州");
        // zhong qing。。。
        cityNames.add("重庆");
        chineseSort(cityNames);
        cityNames.forEach(System.out::println);
    }

}
