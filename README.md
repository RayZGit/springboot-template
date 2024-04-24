## Summary

### Setup
#### Mybatis
- Generate by clicking the datastore to generate the mapper, model and service(with Impl)


### Bug Fix
#### Invalid value type for attribute ‘factoryBeanObjectType‘
```java
Caused by: java.lang.IllegalArgumentException: Invalid value type for attribute 'factoryBeanObjectType': java.lang.String
at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.getTypeForFactoryBeanFromAttributes(FactoryBeanRegistrySupport.java:86)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getTypeForFactoryBean(AbstractAutowireCapableBeanFactory.java:837)
at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:620)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doGetBeanNamesForType(DefaultListableBeanFactory.java:575)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:534)
at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:138)
at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:788)
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:606)
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754)
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456)
at org.springframework.boot.SpringApplication.run(SpringApplication.java:334)
at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137)
at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58)
at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46)
at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1454)
at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:553)
at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137)
at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:108)
at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:225)
at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:152)
	... 17 more
```
>某个类的 factoryBeanObjectType 属性类型与配置类型不符合，导致报错，有大佬表示，Spring 从初版就会存在这个问题，不过当时对于这个问题采取了忽略处理，但新版本的 Spring 采取报错来处理。
所以，这个错误一般是由于 Spring 新版本导致的与其他框架不兼容现象，解决办法一般是升级其他框架版本。
[ref](https://oldmoon.top/post/189#%E6%8A%A5%E9%94%99%E5%8E%9F%E5%9B%A0)

#### Invalid value type for attribute ‘factoryBeanObjectType‘

```java
org.springframework.jdbc.BadSqlGrammarException: 
### Error updating database.  Cause: java.sql.SQLSyntaxErrorException: Unknown column 'user_account' in 'field list'
### The error may exist in com/rayzhou/springboottemplate/mapper/UserMapper.java (best guess)
### The error may involve com.rayzhou.springboottemplate.mapper.UserMapper.insert-Inline
### The error occurred while setting parameters
### SQL: INSERT INTO user  ( user_account, user_password, union_id, mp_open_id, user_name, user_avatar, user_profile, user_role )  VALUES (  ?, ?, ?, ?, ?, ?, ?, ?  )
### Cause: java.sql.SQLSyntaxErrorException: Unknown column 'user_account' in 'field list'
; bad SQL grammar []
```