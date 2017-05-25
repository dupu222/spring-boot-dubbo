# 整合了dubbo和mybatis的spring boot项目
## 项目结构
* 因为很多时候web会放在独立的Tomcat中运行,所以打包成war包,仅依赖service-intr的dubbo接口和domain中的pojo类.
在web中引用dubbo的时候使用@Refrence注解,避免了不必要的xml配置.

* service-impl中是dubbo接口的实现类,需要注意的是@Service为dubbo包中的注解.
依赖了dao-intr的接口,此项目中使用的是mybatis作为持久层的实现,考虑到开发中sql变动比较频繁,所以使用的是xml而非注解.