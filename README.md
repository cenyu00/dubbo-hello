# dubbo-hello
springboot + dubbo + zookeeper 快速启动脚手架


## 启动方法

### 1.确认zookeeper地址
zookeeper的地址写在`mc-service`和`mc-consumer`的`application.yml`文件里，默认是localhost:2181。

如果有需要可以改。

### 2.启动服务提供者：`mc-service`
使用的是springboot项目，所以直接在IDEA中运行`McServiceApplication`类即可，占用端口9091。

### 3.启动服务消费者：`mc-consumer`
直接在IDEA中运行`McConsumerApplication`类即可，占用端口9090。

### 4.页面访问测试
通过web页面访问消费者提供的URL：`http://localhost:8080/hi`即可。


> 最后，祝没有bug！