### Java虚拟机栈
- 每个线程在创建时都会创建一个虚拟机栈，其内部保存一个个的栈帧，对应着一次次的Java方法调用
- 是线程私有的
- 主管Java程序的运行，它保存方法的局部变量、部分结果、并参与方法的调用和返回

![img.png](../../../../../resources/整体.png)

![img.png](../../../../../resources/栈帧结构.png)

![img.png](../../../../../resources/jvmStack1.png)

JvmStackTest
![img.png](../../../../../resources/粗略栈帧.png)

![img.png](../../../../../resources/栈中可能异常.png)

![img.png](../../../../../resources/栈的优点.png)

![img.png](../../../../../resources/虚拟机栈.png)

栈帧内部结构
![img.png](../../../../../resources/栈帧内部结构.png)

局部变量表
![img.png](../../../../../resources/局部变量表.png)

Slot(局部变量槽)
![img.png](../../../../../resources/Slot1.png)
![img.png](../../../../../resources/slot2.png)

动态链接
![img.png](../../../../../resources/动态链接.png)
![img.png](../../../../../resources/动态链接2.png)

动态链接与静态链接
![img.png](../../../../../resources/动态链接与静态链接.png)

[早期绑定与晚期绑定](https://www.bilibili.com/video/BV1PJ411n7xZ?p=56&spm_id_from=pageDriver)
![img.png](../../../../../resources/早期绑定与晚期绑定.png)

方法调用:虚方法与非虚方法
![img.png](../../../../../resources/虚方法非虚方法分类.png)
![img.png](../../../../../resources/方法调用.png)
[示例](https://www.bilibili.com/video/BV1PJ411n7xZ?p=57&spm_id_from=pageDriver)
![img.png](../../../../../resources/方法调用指令.png)

### 相关面试题
