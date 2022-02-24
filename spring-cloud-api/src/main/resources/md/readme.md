### CAP 原则

- consistency：一致性
- availability：可用性
- partition tolerance：分区容错性

eureka: AP (各个节点平等)

zookeeper: CP (故障选举期间服务可能会不可用)

eureka 可以应网络故障导致部分节点失去联系的情况，zookeeper 可能导致整个节点瘫痪



### Eureka 注册中心

注册中心



### Ribbon + RestTemplate 消费服务

通过微服务名称调用

客户端**负载均衡**工具 (连接超时，重试)

- 集中式：nginx，把访问请求通过某种策略转发至服务提供方
- 进程式：消费者从注册中心发现哪些服务可用，然后从中选出合适的





### Feign 消费服务

通过接口 加 注解 调用

默认实现了 Ribbon
