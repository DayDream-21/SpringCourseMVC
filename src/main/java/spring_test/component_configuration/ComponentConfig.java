package spring_test.component_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring_test.component_configuration")
public class ComponentConfig {
}
