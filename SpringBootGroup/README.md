# 一，springboot cache
 - 引入ehcache 包
 ```xml
    <dependency>
        <groupId>net.sf.ehcache</groupId>
        <artifactId>ehcache</artifactId>
    </dependency>
 ```````
 - resources 目录下面添加‘ehcache.xml'。或者可以在application.properties 中指定文件
  ```xml
  <ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:noNamespaceSchemaLocation="ehcache.xsd">

      <cache name="users"
             maxEntriesLocalHeap="200"
             timeToLiveSeconds="600">
      </cache>

  </ehcache>
  ```

  - application.properties 指定cache配置文件
  ```xml
    spring.cache.ehcache.config=classpath:config/cache-config.xml
  ```
  
