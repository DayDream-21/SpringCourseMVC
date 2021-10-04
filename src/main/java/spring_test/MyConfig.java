package spring_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_test.init_destroy.Destroy;
import spring_test.init_destroy.Init;

@Configuration
@ComponentScan(basePackages = "spring_test")
public class MyConfig {
    @Bean(name = "cdPlayer")
    public CDPlayer getPlayer() {
        return new CDPlayer();
    }

    @Bean(initMethod = "insertDisk")
    public Init initMethod() {
        return new Init();
    }

    @Bean(destroyMethod = "removeDisk")
    public Destroy destroyMethod() {
        return new Destroy();
    }
}
