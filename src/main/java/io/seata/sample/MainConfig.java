package io.seata.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration   //@Configuration注解的作用是表示这个类是一个配置类
@ComponentScan({"io.seata.sample.*"})   // 包扫描的位置
@MapperScan(basePackages = "classpath*:/mapper/*.xml")  // 扫描mapper位置
public class MainConfig {
}
