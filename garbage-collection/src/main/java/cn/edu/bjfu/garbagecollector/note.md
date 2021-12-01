### 标记阶段

垃圾标记阶段-对象存活判断  
![img.png](../../../../../resources/垃圾标记阶段-对象存活判断.png)  

引用计数法（java并没有使用）  
![img.png](../../../../../resources/引用计数法.png)  

可达性分析  
![img.png](../../../../../resources/可达性分析.png)  
![img.png](../../../../../resources/可达性分析2.png)  
GCRoots包括  
![img.png](../../../../../resources/GCRoots包括.png)  
![img.png](../../../../../resources/GCRoots包括2.png)  
可达性分析注意  
![img.png](../../../../../resources/可达性分析注意.png)  

finalization机制  
![img.png](../../../../../resources/finalization机制.png)  

对象状态  
![img.png](../../../../../resources/对象状态.png)  

判断是否可回收具体过程  
![img.png](../../../../../resources/判断是否可回收具体过程.png)   

### 清除阶段

清除阶段概述  
![img.png](../../../../../resources/清除阶段概述.png)  

mark-sweep概述  
![img.png](../../../../../resources/mark-sweep概述.png)  
![img.png](../../../../../resources/mark-sweep概2.png)  

mark-sweep优缺点  
![img.png](../../../../../resources/mark-sweep优缺点.png)

复制算法  
![img.png](../../../../../resources/复制算法.png)  
![img.png](../../../../../resources/复制算法图示.png)  

复制算法优缺点  
![img.png](../../../../../resources/复制算法优缺点.png)  

复制算法应用场景  
![img.png](../../../../../resources/复制算法应用场景.png)  

mark-compact算法(标记-整理)  
![img.png](../../../../../resources/mark-compact算法.png)  

mark-compact算法执行过程  
![img.png](../../../../../resources/mark-compact算法执行过程.png)  
![img.png](../../../../../resources/mark-compact算法2.png)  

mark-compact算法优缺点  
![img.png](../../../../../resources/mark-compact算法优缺点.png)  

三种算法小结  
![img.png](../../../../../resources/三种算法小结.png)  

分带收集算法(并不是一种算法，而是在不同场景分别采用上述三种算法)  
![img.png](../../../../../resources/分带收集算法.png)  
![img.png](../../../../../resources/分代收集算法.png)  

CMS概述  
![img.png](../../../../../resources/CMS概述.png)  

增量收集算法  
![img.png](../../../../../resources/增量收集算法.png)  
![img.png](../../../../../resources/增量收集算法缺点.png)  

分区算法  
![img.png](../../../../../resources/分区算法.png)
