package spring_test.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring_test.events")
public class EventConfig {
    @Bean(name = "myStartEventHandler")
    public MyStartEventHandler getStartHandler() {
        return new MyStartEventHandler();
    }

    @Bean(name = "myStopEventHandler")
    public MyStopEventHandler getStopHandler() {
        return new MyStopEventHandler();
    }
}
