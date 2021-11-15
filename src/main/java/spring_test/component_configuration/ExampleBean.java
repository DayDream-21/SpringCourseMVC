package spring_test.component_configuration;

import org.springframework.stereotype.Component;

@Component("exampleBean")
public class ExampleBean {
    public void exampleMethod() {
        System.out.println("smth");
    }
}
