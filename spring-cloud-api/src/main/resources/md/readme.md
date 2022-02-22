### CAP 原则

- consistency：一致性
- availability：可用性
- partition tolerance：分区容错性

eureka: AP (各个节点平等)

zookeeper: CP (故障选举期间服务可能会不可用)

eureka 可以应网络故障导致部分节点失去联系的情况，zookeeper 可能导致整个节点瘫痪
