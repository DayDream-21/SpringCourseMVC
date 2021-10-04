package spring_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import spring_test.init_destroy.Destroy;
import spring_test.init_destroy.Init;

@Configuration
@ComponentScan(basePackages = "spring_test")
public class MyConfig {
    @Bean(name = "cdPlayer")
    @Description("Returns cdPlayer with autowired disk in it")
    public CDPlayer getPlayer() {
        return new CDPlayer();
    }

    @Bean(initMethod = "insertDisk")
    @Description("Prints what disk is inserted")
    public Init initMethod() {
        return new Init();
    }

    @Bean(destroyMethod = "removeDisk")
    @Description("Prints what disk is removed")
    public Destroy destroyMethod() {
        return new Destroy();
    }
}
