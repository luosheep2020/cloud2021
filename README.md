# cloud2021
SpringCloud&amp;SpringCloudAlibaba学习代码
什么是 Spring Cloud Alibaba？

1、阿里巴巴结合自身微服务实践，开源的微服务全家桶

2、在Spring Cloud 项目中孵化，很可能成为Spring Cloud 第二代的标准实现

3、在业界广泛使用，已有很多成功案例

真实应用场景

1、大型复杂的系统，例如大型电商系统

2、高并发系统，例如大型门户，秒杀系统

3、需求不明确，且变更很快的系统，例如创业公司业务系统。

springcloud 第一代 

   Eureka   2.0孵化失败

   Ribbon   进入维护状态，预计2020年1月停止维护，新的标准已形成：spring-cloud-loadbalancer,但暂无参考实现。springcloud Hoxton 才会孵化出替代品。

   Zuul   进入维护状态，预计2020年1月停止维护

   springcloud config   搭建复杂，约定多，设计繁重，没有界面，难以上手

springcloud alibaba

   Nacos Discovery   性能强劲，感知更快

   Ribbon   进入维护状态，预计2020年1月停止维护，新的标准已形成：spring-cloud-loadbalancer,但暂无参考实现。springcloud Hoxton 才会孵化出替代品。   

   Sentinel   可视化配置，上手更简单

   springcloud Gateway   性能是Zuul的1.6倍

   Nacos config   搭建简单，可视化界面，配置管理更高效，学习曲线低

总结：

       组件性能更强、良好的可视化界面、搭建简单，学习曲线低、文档丰富并且是中文

springcloud alibaba 重要组件

1/服务发现：Nacos 

2/实现负载均衡：Ribbon

3/声明式HTTP 客户端-Feign

4/服务容错：Sentinel

5/消息驱动：RocketMQ

6/API网关 Gateway

7/用户认证与授权

8/配置管理Nacos

9/调用链监控Sleuth,

