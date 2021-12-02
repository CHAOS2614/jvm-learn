### 垃圾回收器

垃圾回收器分类  
![img.png](../../../../../resources/垃圾回收器分类.png)  
![img.png](../../../../../resources/垃圾回收器分类2.png)  
![img.png](../../../../../resources/垃圾回收器分类3.png)  
![img.png](../../../../../resources/垃圾回收器分类4.png)  

### 评估垃圾回收器的性能指标  
![img.png](../../../../../resources/评估垃圾回收器的性能指标.png)  

吞吐量  
![img.png](../../../../../resources/吞吐量.png)  
暂停时间  
![img.png](../../../../../resources/暂停时间.png)  
吞吐量与暂停时间对比  
![img.png](../../../../../resources/吞吐量与暂停时间对比.png)  
![img.png](../../../../../resources/吞吐量与暂停时间对比2.png)  

垃圾回收器发展史  
![img.png](../../../../../resources/垃圾回收器发展史.png)  

7款经典垃圾回收器  
![img.png](../../../../../resources/7款经典垃圾回收器.png)  

垃圾收集器的组合关系(jdk8中取消了红色虚线组合，但是仍然能用，jdk9中移除，不能再用；jdk9取消了绿色，但是能用，CMS在jdk14移除)  
![img.png](../../../../../resources/垃圾收集器的组合关系.png)  
![img.png](../../../../../resources/垃圾收集器的组合关系解释.png)  

查看默认垃圾回收器参数  
![img.png](../../../../../resources/查看默认垃圾回收器参数.png)  

### Serial回收器-串行回收
![img.png](../../../../../resources/Serial回收器.png)  
![img.png](../../../../../resources/Serial回收器2.png)  
![img.png](../../../../../resources/Serial回收器3.png)  
![img.png](../../../../../resources/Serial回收器总结.png)  

### ParNew回收器-并行回收

![img.png](../../../../../resources/ParNew回收器.png)  
![img.png](../../../../../resources/ParNew回收器2.png)  
![img.png](../../../../../resources/ParNew回收器3.png)  


### ParallelScavenge回收器-吞吐量优先

![img.png](../../../../../resources/ParallelScavenge回收器.png)  
![img.png](../../../../../resources/ParallelScavenge回收器2.png)  
![img.png](../../../../../resources/ParallelScavenge回收器3.png)  
![img.png](../../../../../resources/ParallelScavenge回收器参数设置.png)  
![img.png](../../../../../resources/ParallelScavenge回收器参数设置2.png)  
![img.png](../../../../../resources/ParallelScavenge回收器参数设置3.png)  


### CMS回收器-低延迟

![img.png](../../../../../resources/CMS回收器.png)  
CMS回收器工作原理  
![img.png](../../../../../resources/CMS回收器工作原理.png)  
![img.png](../../../../../resources/CMS回收器工作原理2.png)  
![img.png](../../../../../resources/CMS回收器工作原理3.png)  
CMS回收器  
![img.png](../../../../../resources/CMS回收器2.png)  
CMS回收器优缺点  
![img.png](../../../../../resources/CMS回收器优缺点.png)  

小结  
![img.png](../../../../../resources/垃圾回收器小结.png)  
![img.png](../../../../../resources/垃圾回收器小结2.png)  


### G1回收器-区域化分代
G1回收器  
![img.png](../../../../../resources/G1回收器.png)  
G1回收器名称起源  
![img.png](../../../../../resources/G1回收器名称起源.png)  
![img.png](../../../../../resources/G1回收器名称起源2.png)  
G1回收器优势  
![img.png](../../../../../resources/G1回收器优势.png)  
G1回收器region  
![img.png](../../../../../resources/G1回收器region.png)  
G1回收器空间整合  
![img.png](../../../../../resources/G1回收器空间整合.png)  
可预测的停顿时间模型  
![img.png](../../../../../resources/可预测的停顿时间模型.png)  
G1回收器缺点  
![img.png](../../../../../resources/G1回收器缺点.png)  
G1回收器的适用场景  
![img.png](../../../../../resources/G1回收器的适用场景.png)  
分区Region  
![img.png](../../../../../resources/分区Region.png)  
![img.png](../../../../../resources/分区Region2.png)  
G1回收器H区  
![img.png](../../../../../resources/G1回收器H区.png)  
G1回收器回收过程  
![img.png](../../../../../resources/G1回收器回收过程.png)  
![img.png](../../../../../resources/G1回收器回收过程2.png)  
RememberedSet  
![img.png](../../../../../resources/RememberedSet.png)  
![img.png](../../../../../resources/G1回收器回收过程3.png)  
G1回收器回收过程-年轻代gc  
![img.png](../../../../../resources/G1回收器回收过程-年轻代gc.png)  
G1回收器回收过程-并发标记  
![img.png](../../../../../resources/G1回收器回收过程-并发标记.png)  
G1回收器回收过程-混合回收  
![img.png](../../../../../resources/G1回收器回收过程-混合回收.png)  
![img.png](../../../../../resources/G1回收器回收过程-混合回收2.png)  
G1回收器回收过程-FullGC  
![img.png](../../../../../resources/G1回收器回收过程-FullGC.png)  


### 回收器总结
![img.png](../../../../../resources/经典垃圾回收器总结.png)  
垃圾回收器新发展  
![img.png](../../../../../resources/垃圾回收器新发展.png)  
ShenandoahGC  
![img.png](../../../../../resources/ShenandoahGC.png)  
ZGC  
![img.png](../../../../../resources/ZGC.png)  




