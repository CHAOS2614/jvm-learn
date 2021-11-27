package cn.edu.bjfu.head;

/**
 * -XX:NewRatio8 ：设置新生代老年代比例，默认值是2
 * -XX:SurvivorRatio：设置新生代中Eden区和survivor区的比例
 * -XX:-UserAdaptiveSizePolicy:关闭自适应的内存分配策略（暂时没用）
 * -Xmn:设置新生代的空间大小（具体大小以这个为准，会覆盖比例分配，一般不设置，按比例分）
 *
 * @author chaos
 * @date 2021-11-27 22:20
 */
public class EdenSurvivorTest {
}
